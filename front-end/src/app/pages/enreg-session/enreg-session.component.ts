import { Component, OnInit } from '@angular/core';
import Adresse from 'src/app/models/adresse.model';
import Utilisateur from 'src/app/models/utilisateur.model';
import { UtilisateurService } from 'src/app/services/utilisateur.service';

@Component({
  selector: 'app-enreg-session',
  templateUrl: './enreg-session.component.html',
  styleUrls: ['./enreg-session.component.scss']
})
export class EnregSessionComponent implements OnInit {
utilisateur!: Utilisateur;
adresse!: Adresse;
  constructor(private utilisateurService: UtilisateurService, private adresseService: AdresseService) { }

  ngOnInit(): void {
  }
  public ajoutUtilisateur(): void {

  }
}
