import { NO_ERRORS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { EmployeeService } from '../../services/employee.service';
import { EmployeeViewComponent } from './employee-view.component';

const mockStub = {
  getEmployees: ()
};
describe('EmployeeViewComponent', () => {
  let component: EmployeeViewComponent;
  let fixture: ComponentFixture<EmployeeViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [EmployeeViewComponent],
      schemas: [NO_ERRORS_SCHEMA],
      providers: [
        { provide: EmployeeService, useValue: mockStub }
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
