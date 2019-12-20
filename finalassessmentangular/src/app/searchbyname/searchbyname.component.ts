import { Component, OnInit } from '@angular/core';
import { ProductservicesService } from '../productservices.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchbyname',
  templateUrl: './searchbyname.component.html',
  styleUrls: ['./searchbyname.component.css']
})
export class SearchbynameComponent implements OnInit {
  error: string;
  constructor(private product: ProductservicesService, private router: Router) { }
  searchProducts(form: NgForm) {
    console.log(form.value);
    this.product.deleteProducts(form.value).subscribe(data => {
      console.log('Response from searchProduct', data);
      if (data && data.message === 'found') {
        localStorage.setItem('productDetails', JSON.stringify(data));
        this.router.navigateByUrl('user');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;

    });
  }
  ngOnInit() {
  }

}

