import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.css']
})
export class CatalogueComponent implements OnInit {

  constructor(
    protected router: Router,
  ) { }

  ngOnInit(): void {
  }

  back(){
    this.router.navigate(['/dashboard']);
  }

}
