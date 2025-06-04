import {Component} from "@angular/core";
import {Usuario} from "../model/security/usuario";
import {Router} from "@angular/router";

@Component({
  selector: "login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent{

  user:Usuario
  temCadastro: boolean = true;

  constructor(private router:Router) {
    this.user = new Usuario();
  }

  onSubmit(){
    if(this.temCadastro == true){

      this.router.navigate(["/home"]);
    }else{
      this.cadastro();
    }


  }

  mudarParaCadastro(){
    this.temCadastro = !this.temCadastro;
    this.user.password = "";
    this.user.email = "";
  }

  cadastro(){

  }

  login(){

  }



}
