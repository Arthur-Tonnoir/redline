import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Domaine from '../models/domaine.model';

@Injectable({
  providedIn: 'root'
})
export class DomaineService {

  private apiUrl = 'http://localhost:8080'

  constructor(private httpClient: HttpClient) { }

  getDomaines(): Observable<Domaine[]>{
    return this.httpClient.get<Domaine[]>(`${this.apiUrl}/Domaine`);
  }

  getDomaine(id: number): Observable<Domaine>{
    return this.httpClient.get<Domaine>(`${this.apiUrl}/Domaine/${id}`);
  }

  createDomaine(domaine: Domaine): Observable<Domaine>{
    return this.httpClient.post<Domaine>(`${this.apiUrl}/Domaine`, domaine);
  }

  updateDomaine(domaine: Domaine): Observable<Domaine>{
    return this.httpClient.put<Domaine>(`${this.apiUrl}/Domaine/${domaine.id}`, domaine);
  }

  deleteDomaine(domaine: Domaine): Observable<Domaine> {
    return this.httpClient.delete<Domaine>(`${this.apiUrl}/Domaine/${domaine.id}`);
  }
}
