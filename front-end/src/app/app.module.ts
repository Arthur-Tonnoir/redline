import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import {MatButtonModule} from '@angular/material/button';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatCardModule } from '@angular/material/card';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import {MatRadioModule} from '@angular/material/radio';


import { AppComponent } from './app.component';
import { NavbarComponent } from './commons/navbar/navbar.component';
import { FooterComponent } from './commons/footer/footer.component';
import { NotfoundComponent } from './commons/notfound/notfound.component';
import { HomeComponent } from './pages/home/home.component';
import { CatalogueComponent } from './pages/catalogue/catalogue.component';
import { EspaceClientComponent } from './pages/espace-client/espace-client.component';
import { EspaceResponsableComponent } from './pages/espace-responsable/espace-responsable.component';
import { EnregSessionComponent } from './pages/enreg-session/enreg-session.component';
import { DetailFormationComponent } from './pages/detail-formation/detail-formation.component';
import { ListFormationComponent } from './pages/list-formation/list-formation.component';
import { TestPrerequisComponent } from './pages/test-prerequis/test-prerequis.component';
import { TestValidationComponent } from './pages/test-validation/test-validation.component';
import { DevisFormPersonaliseComponent } from './pages/devis-form-personalise/devis-form-personalise.component';
import { ContactComponent } from './pages/contact/contact.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    NotfoundComponent,
    HomeComponent,
    CatalogueComponent,
    EspaceClientComponent,
    EspaceResponsableComponent,
    EnregSessionComponent,
    DetailFormationComponent,
    ListFormationComponent,
    TestPrerequisComponent,
    TestValidationComponent,
    DevisFormPersonaliseComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatButtonModule,
    MatGridListModule,
    MatCardModule,
    FormsModule,
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatRadioModule


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
