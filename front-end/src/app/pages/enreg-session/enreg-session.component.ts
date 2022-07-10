import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Utilisateur from 'src/app/models/utilisateur.model';
import { UtilisateurService } from 'src/app/services/utilisateur.service';

@Component({
  selector: 'app-enreg-session',
  templateUrl: './enreg-session.component.html',
  styleUrls: ['./enreg-session.component.scss'],
})
export class EnregSessionComponent implements OnInit {
  utilisateur!: Utilisateur;
  //utilisateurForm: FormGroup;
  submitted: boolean = false;
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
    idSession: [''],
    experience: [''],
    noteFormateur: [''],
    estClient: [true],
    estFormateur: [false],
    estResponsable: [false]
  });
  constructor(private formBuilder: FormBuilder, private utilisateurService: UtilisateurService) {

  }

  ngOnInit(): void {

  }

  get form() {
    return this.utilisateurForm.controls;
  }

  onSubmit() {
    this.submitted = true;
    console.log("envoyé");
    this.utilisateurService.createUtilisateur(this.utilisateurForm.value);
  }
}
