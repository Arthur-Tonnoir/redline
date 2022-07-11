import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Session from '../models/session.model';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  private apiUrl = 'http://localhost:8080'

  constructor(private httpClient: HttpClient) { }

  getSessions(): Observable<Session[]> {
    return this.httpClient.get<Session[]>(`${this.apiUrl}/Session`);
  }

  getSession(id: number): Observable<Session> {
    return this.httpClient.get<Session>(`${this.apiUrl}/Session/${id}`);
  }

  createSession(session: Session): Observable<Session> {
    return this.httpClient.post<Session>(`${this.apiUrl}/Session`, session);
  }

  updateSession(session: Session): Observable<Session> {
    return this.httpClient.put<Session>(`${this.apiUrl}/Session/${session.id}`, session);
  }

  deleteSession(session: Session): Observable<Session> {
    return this.httpClient.delete<Session>(`${this.apiUrl}/Session/${session.id}`);
  }

}
