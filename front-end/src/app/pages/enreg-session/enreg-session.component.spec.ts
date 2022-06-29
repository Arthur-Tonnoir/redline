import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnregSessionComponent } from './enreg-session.component';

describe('EnregSessionComponent', () => {
  let component: EnregSessionComponent;
  let fixture: ComponentFixture<EnregSessionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnregSessionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnregSessionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
