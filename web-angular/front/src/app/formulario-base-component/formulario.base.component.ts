import {Component, Input} from "@angular/core";

@Component({
  selector: "formulario-base",
  templateUrl: "./formulario.base.component.html",
  styleUrls: ["./formulario.base.component.css"]
})
export class FormularioBaseComponent{

  @Input() tipoFormulario!: string;
  @Input() nomeFormulario!: string;
}
