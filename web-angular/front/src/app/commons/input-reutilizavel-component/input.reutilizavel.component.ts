import {Component, Input} from "@angular/core";

@Component({
  selector: "input-reutilizavel",
  templateUrl: "./input.reutilizavel.component.html",
  styleUrls: ["./input.reutilizavel.component.css"]
})
export class InputReutilizavelComponent{

   @Input() tipoInput:String = "text";
   @Input() label!:String;


}
