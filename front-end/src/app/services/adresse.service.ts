import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Adresse from '../models/adresse.model';

@Injectable({
  providedIn: 'root'
})
export class AdresseService {

  private apiUrl = 'http://localhost:8080'

  constructor(private httpClient: HttpClient) { }

  getAdresses(): Observable<Adresse[]>{
    return this.httpClient.get<Adresse[]>(`${this.apiUrl}/Adresse`);
  }

  getAdresse(id: number): Observable<Adresse> {
    return this.httpClient.get<Adresse>(`${this.apiUrl}/Adresse/${id}`);
  }

  createAdresse(adresse: Adresse): Observable<Adresse>{
    return this.httpClient.post<Adresse>(`${this.apiUrl}/Adresse`,adresse);
  }
}
