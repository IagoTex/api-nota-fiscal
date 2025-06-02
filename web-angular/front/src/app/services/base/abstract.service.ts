import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {AbstractEntity} from "../../model/abstractEntity";
import {API_CONFIG} from "../../configs/api.config";

export abstract class AbstractService<T extends AbstractEntity>{

  classe: T;

  constructor(protected http: HttpClient, protected url:string) { }

  findbyId(id:any): Observable<T>{
    return this.http.get<T>(`${API_CONFIG.baseUrl}/${this.url}/${id}`);

  }

  findAll(): Observable<Array<T>>{
    return this.http.get<Array<T>>(`${API_CONFIG.baseUrl}/${this.url}`);
  }

  create(objeto: T): Observable<T>{
    return this.http.post<T>(`${API_CONFIG.baseUrl}/${this.url}`, objeto);
  }

  update(objeto: T): Observable<T>{
    return this.http.put<T>(`${API_CONFIG.baseUrl}/${this.url}`, objeto);
  }

  delete(id: any): Observable<T>{
    return this.http.delete<T>(`${API_CONFIG.baseUrl}/${this.url}/${id}`)
  }




}
