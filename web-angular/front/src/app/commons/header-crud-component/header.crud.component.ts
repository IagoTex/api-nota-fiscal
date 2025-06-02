import {Component, EventEmitter, OnInit, Output} from "@angular/core";

@Component({
  selector: "header-crud",
  templateUrl: "./header.crud.component.html",
  styleUrls: ["./header.crud.component.css"]
})
export class HeaderCrudComponent implements OnInit{

  @Output() mudaMenu = new EventEmitter<string>();

  aba:string = 'listar';

  ngOnInit() {
    this.changeMenu(this.aba)
  }


  changeMenu(menu: string): void{
    this.aba = menu;
    this.mudaMenu.emit(this.aba)

    }


  }

