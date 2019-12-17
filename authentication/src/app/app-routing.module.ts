import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { AdminComponent } from './admin/admin.component';
import { AuthguardService } from './authguard.service';



const routes: Routes = [
  {path:'register' , component:RegisterComponent },
  {path:'login' , component:LoginComponent },
  {path:'home' , component:HomeComponent },
  {
    path:'admin' , component:AdminComponent,
    canActivate: [AuthguardService], data: {roles:['admin']}
   },
  {
    path:'user' , component:UserComponent,
    canActivate: [AuthguardService], data: {roles:['admin','user']}
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
