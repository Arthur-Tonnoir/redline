import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Session from 'src/app/models/session.model';
import Utilisateur from 'src/app/models/utilisateur.model';
import { UtilisateurService } from 'src/app/services/utilisateur.service';
import { SessionService } from 'src/app/services/session.service';
import { AdresseService } from 'src/app/services/adresse.service';
import Adresse from 'src/app/models/adresse.model';

@Component({
  selector: 'app-enreg-session',
  templateUrl: './enreg-session.component.html',
  styleUrls: ['./enreg-session.component.scss'],
})
export class EnregSessionComponent implements OnInit {
  session!: Session;
  utilisateur!: Utilisateur;
  adresseClient!: Adresse;
  id_adresse!:number;

  soumis: boolean = false;
  utilisateurForm: FormGroup;
  adresseForm: FormGroup;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private formBuilder: FormBuilder,
    private utilisateurService: UtilisateurService,
    private adresseService: AdresseService,
    private sessionService: SessionService
  )
  {
    this.utilisateurForm = this.formBuilder.group({
      id: [''],
      nom: ['Bertrand', [Validators.minLength(2), Validators.required]],
      prenom: ['Jean', [Validators.minLength(2), Validators.required]],
      email: ['jeanbertrand@yahoo.cr', [Validators.email, Validators.required]],
      telephone: ['0684257978', [Validators.minLength(10), Validators.required]],
      fonctionResponsable: [''],
      serviceAssocie: [''],
      nomEntreprise: ['Microsoft'],
      session: [''],
      experience: [''],
      noteFormateur: [''],
      estClient: [true],
      estFormateur: [false],
      estResponsable: [false],
    });



    this.adresseForm = this.formBuilder.group({
      id: ['', [Validators.minLength(1), Validators.required]],
      numero: ['128', [Validators.minLength(1), Validators.required]],
      rue: ['rue du malinois', [Validators.minLength(2), Validators.required]],
      complement: [''],
      codePostal: ['59000', [Validators.minLength(5), Validators.required]],
      ville: ['Lille', [Validators.minLength(2), Validators.required]],
    });

    this.utilisateurForm.addControl('adresse', this.adresseForm);
  }


  ngOnInit(): void {
    const tmp = this.route.snapshot.paramMap.get('id');
    const sessionId: number = Number(tmp);
    this.sessionService.getSession(sessionId).subscribe((result) => {
      this.session = result;
    });
    this.soumis = false;
  }

  get formUtilisateur() {
    return this.utilisateurForm.controls;
  }

  get formAdresse() {
    return this.adresseForm.controls;
  }

  enregAdresse(): boolean {
    this.adresseClient = this.adresseForm.value;

    if (this.adresseService.createAdresse(this.adresseClient).subscribe((data) =>
    {
      this.adresseService.getAdresse(data.id).subscribe((find)=> {
        this.adresseClient.id = find.id;
      });
    }))
    {
      return true;
    }
    else {
      return false;
    }
  }

  /**
   * Méthode qui permet de créer un utilisateur à partir des infos du formulaire
   */
  enregUtilisateur(): void{
    this.utilisateur=this.utilisateurForm.value;
    this.utilisateur.session = this.session;
  }

  onSubmit(): void {
    if(this.enregAdresse()){
      this.enregUtilisateur();
      this.utilisateurService.createUtilisateur(this.utilisateur).subscribe((data)=>console.log(data));
    }
    this.adresseForm.reset();
    this.utilisateurForm.reset();
  }

}
