import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductservicesService } from '../productservices.service';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-showallproducts',
  templateUrl: './showallproducts.component.html',
  styleUrls: ['./showallproducts.component.css']
})
export class ShowallproductsComponent implements OnInit {
  list;
  constructor(private http: HttpClient) {
    http.get<any>('http://localhost:8080/stockmanagement/allproducts').subscribe(response => {
      console.log(response);
      this.list = response.productInfo;
    }, err => {
      console.log(err);
    });
  }

  addtoCart(li) {
    this.http.post('http://localhost:8080/stockmanagement/addtocart', li).subscribe(response => {
      console.log(response);

    }, err => {
      console.log(err);

    }
    );
  }
  deleteProducts(li) {
    this.http.delete(`http://localhost:8080/stockmanagement/remove/${li.pid}`, li).subscribe(response => {
      console.log(response);

    }, err => {
      console.log(err);

    }
    );

  }

  ngOnInit() {

  }

}
