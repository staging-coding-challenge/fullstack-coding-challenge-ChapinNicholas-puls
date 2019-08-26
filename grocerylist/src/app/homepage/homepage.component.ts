import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  groceryLists = [
    {id: 1, name: 'Example', desc: 'This is an example'},
    {id: 2, name: '2nd Example', desc: 'This yet another example'},
    {id: 3, name: '3rd Example', desc: 'just another example'},
    {id: 4, name: '4th Example', desc: 'final example'}
  ];
  constructor( private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
  }

  public seeList (listId){
    this.router.navigate(['list/' + listId]);
  }

}
