import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { UtilisateurService } from 'src/app/services/utilisateur.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-utilisateur-add',
  templateUrl: './utilisateur-add.component.html',
  styleUrls: ['./utilisateur-add.component.scss'],
})
export class UtilisateurAddComponent implements OnInit {
  utilisateurForm: FormGroup;

  utilisateur!: any;

  submitted = false;

  constructor(
    private router: Router,
    private utilisateurservice: UtilisateurService
  ) {
    this.utilisateurForm = new FormGroup({
      nom: new FormControl('', Validators.required),
      prenom: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
    });
  }

  ngOnInit(): void {
    this.submitted = false;
  }

  enregUtilisateur(): void {
    this.submitted = true;
    this.utilisateurservice.createUtilisateur(this.utilisateur).subscribe({
      next: (data) => {
        console.log(data);
        this.router.navigateByUrl('dashboard/view-utilisateur');
      },
      error: (error) => {
        console.log(error);
      },
    });
  }

  get UtilisateurNom(): any {
    return this.utilisateurForm.get('nom');
  }

  get UtilisateurPrenom(): any {
    return this.utilisateurForm.get('prenom');
  }

  get UtilisateurEmail(): any {
    return this.utilisateurForm.get('email');
  }

  addUtilisateurForm(): void {
    this.submitted = false;
    this.utilisateur = this.utilisateurForm.value;
    this.enregUtilisateur();
    this.utilisateurForm.reset();
    this.utilisateur.reset();
  }
}
