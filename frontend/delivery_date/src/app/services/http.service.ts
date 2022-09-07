import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Branch } from '../models/branch.model';
import { Order } from './../models/order.model';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  private url = 'http://localhost:8080/deliverydate';

  constructor(private httpClient: HttpClient) {
  }

  GetAllBranches(api: string): Observable<Branch[]> {
    return this.httpClient.get<Branch[]>(`${this.url}/${api}`);
  }

  GetAllOrders(api: string): Observable<Order[]> {
    return this.httpClient.get<Order[]>(`${this.url}/${api}`);
  }
}
