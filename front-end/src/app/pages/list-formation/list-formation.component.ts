import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import SousTheme from 'src/app/models/soustheme.model';
import Theme from 'src/app/models/theme.model';
import { SousThemeService } from 'src/app/services/sous-theme.service';
import { ThemeService } from 'src/app/services/theme.service';

@Component({
  selector: 'app-list-formation',
  templateUrl: './list-formation.component.html',
  styleUrls: ['./list-formation.component.scss']
})
export class ListFormationComponent implements OnInit {

  theme!: Theme;

  sousthemes: SousTheme[] = [];

  constructor(private st: SousThemeService, private th: ThemeService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {

    const tmp = this.route.snapshot.paramMap.get('id');

    const id: number = Number(tmp);

    if (id)
    {
      this.th.getTheme((id)).subscribe((theme) => {this.theme = theme});
    }

    this.st.getSousThemes().subscribe((soustheme) => {this.sousthemes = soustheme});
  }

}
