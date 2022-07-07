import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NotfoundComponent } from './commons/notfound/notfound.component';
import { DetailFormationComponent } from './pages/detail-formation/detail-formation.component';
import { HomeComponent } from './pages/home/home.component';
import { ListFormationComponent } from './pages/list-formation/list-formation.component';
import { CatalogueComponent } from './pages/catalogue/catalogue.component';
import { ContactComponent } from './pages/contact/contact.component';
import { EspaceClientComponent } from './pages/espace-client/espace-client.component';

const routes: Routes = [
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path: 'home', component:HomeComponent},
  {path: 'catalogue', component:CatalogueComponent},
  {path: 'detailformation/:id', component:DetailFormationComponent},
  {path: 'listformation', component:ListFormationComponent},
  {path: 'contact', component:ContactComponent},
  {path: 'espaceclient', component:EspaceClientComponent},
  {path: '**', component:NotfoundComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
