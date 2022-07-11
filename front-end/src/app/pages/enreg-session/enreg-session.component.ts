import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Session from 'src/app/models/session.model';
import Utilisateur from 'src/app/models/utilisateur.model';
import { UtilisateurService } from 'src/app/services/utilisateur.service';
import { SessionService } from 'src/app/services/session.service';
import { first } from 'rxjs';
@Component({
  selector: 'app-enreg-session',
  templateUrl: './enreg-session.component.html',
  styleUrls: ['./enreg-session.component.scss'],
})
export class EnregSessionComponent implements OnInit {
  session!: Session;
  utilisateur!: Utilisateur;
  soumis: boolean = false;

  utilisateurForm: FormGroup = this.formBuilder.group({
    nom: ['', [Validators.minLength(2), Validators.required]],
    prenom: ['', [Validators.minLength(2), Validators.required]],
    email: ['', [Validators.email, Validators.required]],
    telephone: ['', [Validators.minLength(10), Validators.required]],
    adresse: this.formBuilder.group({
      numero: ['', [Validators.minLength(1), Validators.required]],
      rue: ['', [Validators.minLength(2), Validators.required]],
      complement: [''],
      codePostal: ['', [Validators.minLength(5), Validators.required]],
      ville: ['', [Validators.minLength(2), Validators.required]],
    }),
    fonctionResponsable: [''],
    serviceAssocie: [''],
    nomEntreprise: [''],
    session: [this.session],
    experience: [''],
    noteFormateur: [''],
    estClient: [true],
    estFormateur: [false],
    estResponsable: [false],
  });

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private formBuilder: FormBuilder,
    private utilisateurService: UtilisateurService,
    private sessionService: SessionService
  ) {}

  ngOnInit(): void {
    const tmp = this.route.snapshot.params['id'];
    const sessionId: number = tmp;
    this.sessionService.getSession(sessionId).subscribe((result) => {
      this.session = result;
    });
    this.soumis = false;
  }

  get form() {
    return this.utilisateurForm.controls;
  }

  onSubmit(): void {
    if (this.utilisateurForm.invalid) {
      console.log('le formulaire a fait ploufffff!');
    } else
      {
        console.log('le formulaire yeahhhh!');
        this.utilisateurService.createUtilisateur(this.utilisateurForm.value).subscribe((data)=>{console.log(data)});}
  }
}
