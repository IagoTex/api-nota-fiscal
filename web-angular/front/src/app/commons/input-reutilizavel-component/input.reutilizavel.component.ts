import {Component, EventEmitter, Input, Output} from "@angular/core";

@Component({
  selector: "input-reutilizavel",
  templateUrl: "./input.reutilizavel.component.html",
  styleUrls: ["./input.reutilizavel.component.css"]
})
export class InputReutilizavelComponent{

   @Input() tipoInput:string = "text";
   @Input() label:string;
   @Input() value:string;
   @Input() name: string;

   @Output() valueChange = new EventEmitter<string>();


   onValueChange(newValue: string){
     this.value = newValue;
     console.log(newValue)
     this.valueChange.emit(newValue);

   }



}
