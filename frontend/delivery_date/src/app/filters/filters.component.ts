import { Component, OnInit } from '@angular/core';

import { HttpService } from '../services/http.service';
import { Branch } from './../models/branch.model';
import { Order } from './../models/order.model';

@Component({
  selector: 'app-filters',
  templateUrl: './filters.component.html',
  styleUrls: ['./filters.component.scss']
})
export class FiltersComponent implements OnInit {

  branchList: Branch[] = [];
  orderList: Order[] = [];

  constructor(private httpService: HttpService) {}

  ngOnInit(): void {
    this.httpService.GelAllBranches('branch').subscribe((branches: Branch[]) => {
      this.branchList = branches;
    });

    this.httpService.GelAllOrders('order').subscribe((orders: Order[]) => {
      this.orderList = orders;
    });
  }

}
