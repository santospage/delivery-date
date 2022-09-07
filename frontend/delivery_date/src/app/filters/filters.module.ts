import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { FiltersComponent } from './filters.component';

@NgModule({
  declarations: [
    FiltersComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    FormsModule
  ],
  exports: [
    FiltersComponent
  ]
})
export class FiltersModule { }
