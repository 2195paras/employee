import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient: HttpClient) { }

  public registerEmployee(payload: any): Observable<any> {
    console.log(payload);
    return this.httpClient.post('http://localhost:8080/employee/register', payload);
  }
  public getEmployees(): Observable<any> {
    return this.httpClient.get('http://localhost:8080/employee/get');
  }
}
