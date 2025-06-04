import {NgModule} from "@angular/core";
import {BarraPesquisaComponent} from "./barra-pesquisa-component/barra.pesquisa.component";
import {HeaderCrudComponent} from "./header-crud-component/header.crud.component";
import {InputReutilizavelComponent} from "./input-reutilizavel-component/input.reutilizavel.component";
import {CommonModule} from "@angular/common";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AppRoutingModule} from "../app-routing.module";
import {FormularioBaseComponent} from "./formulario-base-component/formulario.base.component";

@NgModule({
  declarations: [
    BarraPesquisaComponent,
    HeaderCrudComponent,
    InputReutilizavelComponent,
    FormularioBaseComponent
  ],
  imports: [
    CommonModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,

  ],
  exports: [
    BarraPesquisaComponent,
    HeaderCrudComponent,
    InputReutilizavelComponent,
    FormularioBaseComponent
  ]
})
export class SharedModule{ }
