import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import Utilisateur from '../models/utilisateur.model';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  private baseUrl = 'http://localhost:8080';



  constructor(private http:HttpClient) { }



  getUtilisateurList(): Observable<Utilisateur[]> {
    return this.http.get<Utilisateur[]>(`${this.baseUrl}/Utilisateur`);
  }

  createUtilisateur(utilisateur: Utilisateur): Observable<Utilisateur> {
    return this.http.post<Utilisateur>(`${this.baseUrl}/Utilisateur`, utilisateur);
  }
  //id id: number
  deleteUtilisateur(id: number): Observable<Utilisateur> {
    return this.http.delete<Utilisateur>(`${this.baseUrl}/Utilisateur/${id}`);
  }

  getUtilisateur(id: number): Observable<Utilisateur> {
    return this.http.get<Utilisateur>(`${this.baseUrl}/Utilisateur/${id}`);
  }
  //put not post  //id id: number
  updateUtilisateur(utilisateur: Utilisateur): Observable<Utilisateur> {
    return this.http.put<Utilisateur>(`${this.baseUrl}/Utilisateur/${utilisateur.id}`, utilisateur);
  }

}
