import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {

  constructor(
    protected router: Router,
  ) { }

  ngOnInit(): void {
  }

  goCat(){
    this.router.navigate(['/catalogue']);
  }

  goOrder(){
    this.router.navigate(['/order']);
  }
}
