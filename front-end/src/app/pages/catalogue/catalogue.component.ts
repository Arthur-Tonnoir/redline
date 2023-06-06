import { Component, OnInit } from '@angular/core';
import Domaine from 'src/app/models/domaine.model';
import Theme from 'src/app/models/theme.model';
import { DomaineService } from 'src/app/services/domaine.service';
import { ThemeService } from 'src/app/services/theme.service';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.scss'],
})
export class CatalogueComponent implements OnInit {
  domaines: Domaine[] = [];

  themes: Theme[] = [];

  constructor(private dm: DomaineService, private tm: ThemeService) {}

  ngOnInit(): void {
    this.dm.getDomaines().subscribe((domain) => {
      this.domaines = domain;
    });
    this.tm.getThemes().subscribe((theme) => {
      this.themes = theme;
    });
  }
}
