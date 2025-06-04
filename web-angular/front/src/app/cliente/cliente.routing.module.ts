import {RouterModule, Routes} from "@angular/router";
import {ClienteCrudComponent} from "./cliente-crud/cliente.crud.component";
import {NgModule} from "@angular/core";


const clienteRoutes: Routes = [

  {path: 'cliente', component: ClienteCrudComponent}
];

@NgModule({
  imports: [RouterModule.forChild(clienteRoutes)],
  exports: [RouterModule]
})
export class ClienteRoutingModule {

}

