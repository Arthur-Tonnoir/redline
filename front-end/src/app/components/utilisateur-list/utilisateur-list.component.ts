import { Component, OnInit } from '@angular/core';
import { UtilisateurService } from 'src/app/services/utilisateur.service';
import { Observable,Subject } from "rxjs";
import {FormControl,FormGroup,Validators} from '@angular/forms';
import Utilisateur from 'src/app/models/utilisateur.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-utilisateur-list',
  templateUrl: './utilisateur-list.component.html',
  styleUrls: ['./utilisateur-list.component.scss']
})
export class UtilisateurListComponent implements OnInit {


  utilisateursArray: Utilisateur[] = [];

  utilisateurupdateform: FormGroup;

  dtOptions: DataTables.Settings = {};

  dtTrigger: Subject<any>= new Subject();

  utilisateurs: Utilisateur[]= [];

  utilisateur!: any;

  deleteMessage=false;

  utilisateurList!: any;

  isupdated = false;

  constructor(private router: Router,private utilisateurservice:UtilisateurService) {

    this.utilisateurupdateform=new FormGroup({
      id: new FormControl('' ,Validators.required),
      nom:new FormControl('',Validators.required),
      prenom:new FormControl('',Validators.required),
      email:new FormControl('',Validators.required),
    });
  }



  ngOnInit(): void {
      this.isupdated=false;
      this.dtOptions = {
        pageLength: 6,
        stateSave:true,
        lengthMenu:[[6, 16, 20, -1], [6, 16, 20, "All"]],
        processing: true
    }

      this.utilisateurservice.getUtilisateurs().subscribe((data) =>{
      this.utilisateurs = data;
      this.dtTrigger.next(data);

      })
  }

  deleteUtilisateur(id: number) {
    this.utilisateurservice.deleteUtilisateur(id)
      .subscribe({
        next: (data) => {
          console.log(data);
          this.deleteMessage=true;
          this.utilisateurservice.getUtilisateurs().subscribe(data =>{
            this.utilisateurs =data
            })
        },
        error : (err) => {
          console.log(err);
        }
      });
  }

  updateUtilisateur(id:number){
    this.utilisateurservice.getUtilisateur(id)
      .subscribe({

        next:(data) => {
        this.utilisateurList = data
        this.utilisateurupdateform.patchValue(data);
        console.log(data);
        },
        error : (err) => {
        console.log(err);
        }
      });
  }


  enreg(): void{

        this.utilisateur = this.utilisateurupdateform.value;

    this.utilisateurservice.updateUtilisateur(this.utilisateur)
    .subscribe(
      {
        next: (data) => {
          console.log(data)
         this.router.navigateByUrl('dashboard/view-utilisateur');
        }
          ,
        error: (error) => {
          console.log(error)
        }
      });

  }

  get UtilisateurId(): any{
    return this.utilisateurupdateform.value.id;
  }

  get UtilisateurNom(){
    return this.utilisateurupdateform.value.nom;
  }
  get UtilisateurPrenom(){
    return this.utilisateurupdateform.value.prenom;
  }

  get UtilisateurEmail(){
    return this.utilisateurupdateform.value.email;
  }

  changeisUpdate(){
    this.isupdated=false;
  }
}
