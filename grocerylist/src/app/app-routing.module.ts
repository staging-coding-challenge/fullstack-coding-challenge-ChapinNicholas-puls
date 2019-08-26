import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { ListPageComponent } from './list-page/list-page.component';
import { AdditemComponent } from './additem/additem.component';


const routes: Routes = [  {path: '', component: HomepageComponent},
                          {path: 'list/:listid', component: ListPageComponent},
                          {path: 'additem/:listid', component: AdditemComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
