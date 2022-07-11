import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import Formation from 'src/app/models/formation.model';
import Session from 'src/app/models/session.model';
import { FormationService } from 'src/app/services/formation.service';
import { SessionService } from 'src/app/services/session.service';

@Component({
  selector: 'app-detail-formation',
  templateUrl: './detail-formation.component.html',
  styleUrls: ['./detail-formation.component.scss']
})
export class DetailFormationComponent implements OnInit {

  formation!: Formation;

  sessions: Session[] = [];

  listSession: Session[] =[];

  dateDebut!: Date;

  constructor(private route: ActivatedRoute, private router: Router, private formationService: FormationService, private sessionService: SessionService) { }

  ngOnInit(): void {

    const tmp = this.route.snapshot.paramMap.get('id');

    const id: number = Number(tmp);

    this.formationService.getFormation(id).subscribe((foramtion) => {this.formation = foramtion});

    this.sessionService.getSessions().subscribe((session) => {
      this.sessions = session;
      this.sessions.find((session) => {
        if (session.formation.id == this.formation.id) {
          this.listSession.push(session);
        }
      })
});

  }

  protected getDate(id: number): void{
    this.sessions.find((session) => {if(session.id == id){this.dateDebut = session.debutSession}});
  }

}
