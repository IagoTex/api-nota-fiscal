import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {FormularioBaseComponent} from "./formulario-base-component/formulario.base.component";
import {HomeComponent} from "./home/home";
import {ClienteCrudComponent} from "./cliente-crud/cliente.crud.component";

const routes: Routes = [

  {path: '', component: HomeComponent},
  {path: 'cliente', component: ClienteCrudComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
