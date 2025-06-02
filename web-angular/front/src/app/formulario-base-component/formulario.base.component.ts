import {Component, EventEmitter, Input, Output} from "@angular/core";

@Component({
  selector: "formulario-base",
  templateUrl: "./formulario.base.component.html",
  styleUrls: ["./formulario.base.component.css"]
})
export class FormularioBaseComponent{

  tipoFormulario!: string;

  @Input() nomeFormulario!: string;
  @Output() detectcaoMenu = new EventEmitter<string>();

  informaMenu(evento:string){
    if(evento != undefined){
      this.detectcaoMenu.emit(evento);
      this.tipoFormulario = evento.charAt(0).toUpperCase()+evento.substring(1, )

    }

  }
}
