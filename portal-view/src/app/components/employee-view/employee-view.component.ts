import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-employee-view',
  templateUrl: './employee-view.component.html',
  styleUrls: ['./employee-view.component.css']
})
export class EmployeeViewComponent implements OnInit {

  public employeeDetails: any;
  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
    this.employeeService.getEmployees().subscribe((response: any) => {
      this.employeeDetails = response;
    });
  }

}
