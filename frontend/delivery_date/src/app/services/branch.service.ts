import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Branch } from '../models/branch.model';

@Injectable({
  providedIn: 'root'
})
export class BranchService {
  private listaBranches: any[];
  private url = 'http://localhost:8080/deliverydate/branch';

  constructor(private httpClient: HttpClient) {
    this.listaBranches = [];
  }
  
  GelAllBranches(): Observable<Branch[]> {
    return this.httpClient.get<Branch[]>(this.url);
  }
}
