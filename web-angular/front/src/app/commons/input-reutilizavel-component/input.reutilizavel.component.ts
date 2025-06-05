import {Component, EventEmitter, Input, OnInit, Output} from "@angular/core";
import {FormControl, Validators} from "@angular/forms";

@Component({
  selector: "input-reutilizavel",
  templateUrl: "./input.reutilizavel.component.html",
  styleUrls: ["./input.reutilizavel.component.css"]
})
export class InputReutilizavelComponent implements OnInit{

   @Input() tipoInput:string = "text";
   @Input() label:string;
   @Input() value:string;
   @Input() name: string;
   @Input() requirido: boolean = false;

   validações = [];
   control: FormControl = new FormControl(null, this.validações)

   @Output() valueChange = new EventEmitter<string>();

   ngOnInit() {
     if(this.requirido = true){
       this.validações.push(Validators.required);
     }
   }

  onValueChange(newValue: string){
     this.value = newValue;
     this.valueChange.emit(newValue);

   }



}
