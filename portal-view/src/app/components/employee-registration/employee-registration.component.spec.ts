import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeRegistrationComponent } from './employee-registration.component';
import { NO_ERRORS_SCHEMA } from '@angular/core';

describe('EmployeeRegistrationComponent', () => {
  let component: EmployeeRegistrationComponent;
  let fixture: ComponentFixture<EmployeeRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeRegistrationComponent ],
      schemas: [NO_ERRORS_SCHEMA],
      providers: []
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
