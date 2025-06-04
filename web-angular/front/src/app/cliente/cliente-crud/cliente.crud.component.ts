import {Component, OnInit} from "@angular/core";
import {Cliente} from "../../model/cliente";
import {FormControl, Validators} from "@angular/forms";
import {ClienteService} from "../../services/cliente.service";

@Component({
  selector: "cliente-crud",
  templateUrl: "./cliente.crud.component.html",
  styleUrls: ["./cliente.crud.component.css"]
})
export class ClienteCrudComponent implements OnInit{

  cliente: Cliente;
  tipoMenu: string;


  nomeCliente: FormControl = new FormControl(null, [Validators.required]);

  constructor(private service:ClienteService) {
  }

  ngOnInit() {
    this.cliente = new Cliente();
  }

  create(){
    this.service.create(this.cliente);
  }

  atualizar(){
    this.service.update(this.cliente);
  }
  deletar(){
    this.service.delete(this.cliente.id);
  }

  mudaMenu(evento: string){
    if(evento != null && evento != undefined){
      console.log(evento)
      this.tipoMenu = evento
      this.cliente.id = null;
      this.cliente.codCliente = '';
      this.cliente.nomeCliente = '';
    }
  }

}
