import { Component, OnInit } from '@angular/core';
import { MatTabChangeEvent } from '@angular/material';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  public selectedTabIndex = 0;
  constructor() { }

  ngOnInit() {
  }
  onTabChanged(event: MatTabChangeEvent) {
    this.selectedTabIndex = event.index;
  }
}
