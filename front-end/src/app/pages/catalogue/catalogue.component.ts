import { Component, OnInit } from '@angular/core';
import Domaine from 'src/app/models/domaine.model';
import Theme from 'src/app/models/theme.model';

import { DomaineService } from 'src/app/services/domaine.service';
import { ThemeService } from 'src/app/services/theme.service';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.scss']
})
export class CatalogueComponent implements OnInit {

  domaines: Domaine[] = [];

  themes: Theme[] = [];

  constructor(private dm: DomaineService, private th : ThemeService) { }

  ngOnInit(): void {
    this.dm.getDomaines().subscribe((domaine) => {this.domaines = domaine});
    this.th.getThemes().subscribe((theme) => {this.themes = theme});
  }

}
