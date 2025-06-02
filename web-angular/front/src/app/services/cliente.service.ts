import {AbstractService} from "./base/abstract.service";
import {Cliente} from "../model/cliente";
import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {API_CONFIG} from "../configs/api.config";


@Injectable({
  providedIn:'root'
})
export class ClienteService extends AbstractService<Cliente>{

  constructor(protected override http: HttpClient) {
    super(http, 'cliente');
  }

  findByName(nome:string): Observable<Array<Cliente>>{
    return  this.http.get<Array<Cliente>>(`${API_CONFIG.baseUrl}/${this.url}/nome/${nome}`);

  }
}
