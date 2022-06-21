import { Branch } from './../models/branch.model';
import { Component, OnInit } from '@angular/core';

import { BranchService } from '../services/branch.service';

@Component({
  selector: 'app-filters',
  templateUrl: './filters.component.html',
  styleUrls: ['./filters.component.scss']
})
export class FiltersComponent implements OnInit {

  branchList: Branch[] = [];

  constructor(private branchService: BranchService) {}

  ngOnInit(): void {
    this.branchService.GelAllBranches().subscribe((branches: Branch[]) => {
      this.branchList = branches;
    });
  }

}
