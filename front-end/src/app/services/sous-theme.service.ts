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
}
