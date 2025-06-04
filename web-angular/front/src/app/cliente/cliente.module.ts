import {NgModule} from "@angular/core";
import {ClienteCrudComponent} from "./cliente-crud/cliente.crud.component";
import {ClienteService} from "../services/cliente.service";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {SharedModule} from "../commons/shared.module";
import {AppRoutingModule} from "../app-routing.module";


@NgModule({
  declarations: [
    ClienteCrudComponent
  ],
  imports: [CommonModule,
    FormsModule,
    AppRoutingModule,
    SharedModule

  ],
  exports: [
    ClienteCrudComponent
  ],
  providers: [ClienteService]
})
export class ClienteModule {
}
