import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Formation from '../models/formation.model';

@Injectable({
  providedIn: 'root'
})
export class FormationService {

  private apiUrl = 'http://localhost:8080'

  constructor(private httpClient: HttpClient) { }

  getFormations(): Observable<Formation[]>{
    return this.httpClient.get<Formation[]>(`${this.apiUrl}/Formation`);
  }

  getFormation(id: number): Observable<Formation>{
    return this.httpClient.get<Formation>(`${this.apiUrl}/Formation/${id}`);
  }
}
