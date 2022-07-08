import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Utilisateur from '../models/utilisateur.model';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  private apiUrl = 'http://localhost:8080'

  constructor(private httpClient: HttpClient) { }

  getUtilisateurs(): Observable<Utilisateur[]>{
    return this.httpClient.get<Utilisateur[]>(`${this.apiUrl}/Utilisateur`);
  }

  getUtilisateur(id: number): Observable<Utilisateur[]> {
    return this.httpClient.get<Utilisateur[]>(`${this.apiUrl}/Utilisateur/${id}`);
  }

  createUtilisateur(utilisateur: Utilisateur): Observable<Utilisateur>{
    return this.httpClient.post<Utilisateur>(this.apiUrl+'/Utilisateurs',utilisateur);
  }
}
