import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {
  get addmovie() {
    return this.form.get('addmovie');
 }
 get movietittle() {
   return this.form.get('movietittle');
 }
 get movieimg() {
  return this.form.get('movieimg');
}
get moviedesc() {
  return this.form.get('moviedesc');
}
  form = new FormGroup ({
  addmovie : new FormControl('', [Validators.required]),
  movietittle : new FormControl('', [Validators.required]),
  movieimg : new FormControl('', [Validators.required]),
  moviedesc : new FormControl('', [Validators.required])


  });
  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form);
  }
}
