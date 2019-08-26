import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-additem',
  templateUrl: './additem.component.html',
  styleUrls: ['./additem.component.css']
})
export class AdditemComponent implements OnInit {
  listId;
  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
    this.listId = this.route.snapshot.params['listid'];
  }

  goHome(){
    this.router.navigate(['/']);
  }

}
