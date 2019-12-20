import { Component, OnInit } from '@angular/core';
import { ProductservicesService } from '../productservices.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-deleteproduct',
  templateUrl: './deleteproduct.component.html',
  styleUrls: ['./deleteproduct.component.css']
})
export class DeleteproductComponent implements OnInit {

  error: string;
  constructor(private product: ProductservicesService, private router: Router) { }
  deleteProducts(form: NgForm) {
    console.log(form.value);
    this.product.deleteProducts(form.value).subscribe(data => {
      console.log('Response from addProduct', data);
      if (data && data.message === 'deleted') {
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

