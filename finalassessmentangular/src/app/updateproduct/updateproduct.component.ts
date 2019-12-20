import { Component, OnInit } from '@angular/core';
import { ProductservicesService } from '../productservices.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent implements OnInit {

  error: string;
  constructor(private product: ProductservicesService, private router: Router) { }
  updateProducts(form: NgForm) {
    console.log(form.value);
    this.product.addProducts(form.value).subscribe(data => {
      console.log('Response from updateProduct', data);
      if (data && data.message === 'success') {
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

