import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router) { }

  isLoggedIn(): boolean{
    const userDetails = JSON.parse(localStorage.getItem('userDetail'));
    if(userDetails){
      return true;
    } else {
      return false;
    }
  }

  isAdmin(){
    const userDetails = JSON.parse(localStorage.getItem('userDetail'));
    if(userDetails && userDetails.role === 'admin'){
      return true;
    }else {
      return false;
    }
  }

  isUser(){
    const userDetails = JSON.parse(localStorage.getItem('userDetail'));
    if(userDetails && userDetails.role === 'user'){
      return true;
    }else {
      return false;
    }
  }
logout(){
  localStorage.removeItem('userDetails');
  this.router.navigateByUrl('/login');
}
  ngOnInit() {
  }

}
