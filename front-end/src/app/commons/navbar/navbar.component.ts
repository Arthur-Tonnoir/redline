import { Component, OnInit } from '@angular/core';
import Domaine from 'src/app/models/domaine.model';
import Theme from 'src/app/models/theme.model';

import { DomaineService } from 'src/app/services/domaine.service';
import { ThemeService } from 'src/app/services/theme.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
})
export class NavbarComponent implements OnInit {
  domaines: Domaine[] = [];

  themes: Theme[] = [];

  constructor(private dm: DomaineService, private th: ThemeService) {}

  ngOnInit(): void {
    this.dm.getDomaines().subscribe((domaine) => {
      this.domaines = domaine;
    });
    this.th.getThemes().subscribe((theme) => {
      this.themes = theme;
    });
  }
}
