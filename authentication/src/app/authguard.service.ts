import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthguardService implements CanActivate {
  canActivate(route: ActivatedRouteSnapshot): boolean {
    const expectedRoleArray = route.data.role;
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    let expectedRole: string;
    for (const index in expectedRoleArray) {
      if (userDetails && userDetails.role === expectedRoleArray[index]) {
        expectedRole = expectedRoleArray[index];
      }
    }
    if (userDetails && expectedRole === userDetails.role) {
      console.log('user authenticated');
      return true;
    } else {
      console.log('user not authenticated');
      return false;
    }
  }
  constructor() { }
}
