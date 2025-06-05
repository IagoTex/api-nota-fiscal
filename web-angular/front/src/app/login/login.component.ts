import {Component, OnInit} from "@angular/core";
import {AuthRequest} from "../model/security/authRequest";
import {Router} from "@angular/router";
import {AuthService} from "../services/security/auth.service";
import {FormControl, Validators} from "@angular/forms";

@Component({
  selector: "login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit{

  user:AuthRequest
  temCadastro: boolean = true;

  
  username: FormControl = new FormControl(null, [Validators.required]);
  password: FormControl = new FormControl(null, [Validators.required])


  constructor(private router:Router,
              private authService: AuthService) {
    this.user = new AuthRequest();
  }

  ngOnInit() {
    this.authService.isAuthenticated().subscribe(isAuthenticated => {
      if(isAuthenticated){
        this.router.navigate(['/home'])
      }
    });
  }

  onSubmit(){
    if(this.temCadastro == true){
      this.login();
    }else{
      this.cadastro();
    }
  }

  mudarParaCadastro(){
    this.temCadastro = !this.temCadastro;
    this.user.password = "";
    this.user.username = "";
  }

  cadastro(){
    this.authService.register(this.user).subscribe(response => {
      console.log("Registro realizado com sucesso!", response);
      this.temCadastro = true;
    }, error => {
      console.log('Erro ao registrar novo usuário', error);
    })

  }

  login(){
    this.authService.login(this.user).subscribe(response =>{
      console.log("Login bem-sucedido!", response);
      this.router.navigate(['/home']);
    }, error => {
      console.log('Erro no login', error);

    })

  }

}
