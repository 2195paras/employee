import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatTabsModule } from '@angular/material/tabs';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { EmployeeRegistrationComponent } from './components/employee-registration/employee-registration.component';
import { EmployeeViewComponent } from './components/employee-view/employee-view.component';
import { EmployeeService } from './services/employee.service';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    EmployeeRegistrationComponent,
    EmployeeViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FontAwesomeModule,
    MatInputModule,
    MatTabsModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
