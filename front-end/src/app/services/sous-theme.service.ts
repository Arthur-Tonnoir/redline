import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import SousTheme from '../models/soustheme.model';

@Injectable({
  providedIn: 'root'
})
export class SousThemeService {

  private apiUrl = 'http://localhost:8080'

  constructor(private httpClient: HttpClient) { }

  getSousThemes(): Observable<SousTheme[]>{
    return this.httpClient.get<SousTheme[]>(`${this.apiUrl}/SousTheme`);
  }

  getSousTheme(id: number): Observable<SousTheme>{
    return this.httpClient.get<SousTheme>(`${this.apiUrl}/SousTheme/${id}`);
  }

  createSousTheme(soustheme: SousTheme): Observable<SousTheme> {
    return this.httpClient.post<SousTheme>(`${this.apiUrl}/SousTheme`, soustheme);
  }

  updateSousTheme(soustheme: SousTheme): Observable<SousTheme> {
    return this.httpClient.put<SousTheme>(`${this.apiUrl}/SousTheme/${soustheme.id}`, soustheme);
  }

  deleteSousTheme(soustheme: SousTheme): Observable<SousTheme> {
    return this.httpClient.delete<SousTheme>(`${this.apiUrl}/SousTheme/${soustheme.id}`);
  }
}
