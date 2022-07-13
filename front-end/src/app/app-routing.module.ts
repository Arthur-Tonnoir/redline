import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NotfoundComponent } from './commons/notfound/notfound.component';
import { DetailFormationComponent } from './pages/detail-formation/detail-formation.component';
import { HomeComponent } from './pages/home/home.component';
import { ListFormationComponent } from './pages/list-formation/list-formation.component';
import { CatalogueComponent } from './pages/catalogue/catalogue.component';
import { EnregSessionComponent } from './pages/enreg-session/enreg-session.component';
import { ContactComponent } from './pages/contact/contact.component';
import { EspaceClientComponent } from './pages/espace-client/espace-client.component';
import { UtilisateurAddComponent } from './components/utilisateur-add/utilisateur-add.component';
import { UtilisateurListComponent } from './components/utilisateur-list/utilisateur-list.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';

const routes: Routes = [
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path: 'home', component:HomeComponent},
  {path: 'catalogue', component:CatalogueComponent},
  {path: 'detailformation/:id', component:DetailFormationComponent},
  {path: 'listformation/:id', component:ListFormationComponent},
  {path: 'enregsession',component:EnregSessionComponent},
  {path: 'contact', component:ContactComponent},
  {path: 'espaceclient', component:EspaceClientComponent},
  {path: 'dashboard', component: DashboardComponent, children: [
    {path: 'view-utilisateur', component: UtilisateurListComponent },
    {path: 'add-utilisateur', component: UtilisateurAddComponent },
  ] },
  {path: '**', component:NotfoundComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
