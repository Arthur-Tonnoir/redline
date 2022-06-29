import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DevisFormPersonaliseComponent } from './devis-form-personalise.component';

describe('DevisFormPersonaliseComponent', () => {
  let component: DevisFormPersonaliseComponent;
  let fixture: ComponentFixture<DevisFormPersonaliseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DevisFormPersonaliseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DevisFormPersonaliseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
