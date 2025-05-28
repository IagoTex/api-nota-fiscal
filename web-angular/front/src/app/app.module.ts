import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HomeComponent} from "./home/home";
import {HeaderComponent} from "./header/header.component";
import {FormularioBaseComponent} from "./formulario-base-component/formulario.base.component";
import {ClienteCrudComponent} from "./cliente-crud/cliente.crud.component";
import {InputReutilizavelComponent} from "./commons/input-reutilizavel-component/input.reutilizavel.component";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FormularioBaseComponent,
    ClienteCrudComponent,
    InputReutilizavelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
