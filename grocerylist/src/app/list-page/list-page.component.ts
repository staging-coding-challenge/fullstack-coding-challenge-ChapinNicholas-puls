import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-list-page',
  templateUrl: './list-page.component.html',
  styleUrls: ['./list-page.component.css']
})
export class ListPageComponent implements OnInit {
  listId;
  items = [
    {id: 1, name: 'Milk', type: 'dairy'},
    {id: 2, name: 'Apple', type: 'Fruit'},
    {id: 3, name: 'HaloTop', type: 'Dessert' },
    {id: 4, name: 'MotorOil', type: 'Auto' }
  ];
  constructor( private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
    this.listId = this.route.snapshot.params['listid'];
  }

  goHome(){
    this.router.navigate(['/']);
  }

  public addToList(listId) {
    this.router.navigate(['additem/' + listId]);
  }


}
