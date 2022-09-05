import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FiltersComponent } from './filters/filters.component';

const routes: Routes = [
  { path: '', redirectTo: 'filters', pathMatch: 'full' },
  { path: 'filters', component: FiltersComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
