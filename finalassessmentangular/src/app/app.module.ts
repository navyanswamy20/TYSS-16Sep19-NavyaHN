import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { ShowallproductsComponent } from './showallproducts/showallproducts.component';
import { DeleteproductComponent } from './deleteproduct/deleteproduct.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    UserComponent,
    AddproductComponent,
    UpdateproductComponent,
    ShowallproductsComponent,
    DeleteproductComponent,
    SearchbynameComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      // { path: '', component: HeaderComponent },
      { path: 'home', component: HomeComponent },
      { path: 'user', component: UserComponent },
      { path: 'add', component: AddproductComponent },
      { path: 'update', component: UpdateproductComponent },
      { path: 'showall', component: ShowallproductsComponent },
      { path: 'delete', component: DeleteproductComponent },
      { path: 'searchbyname', component: SearchbynameComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
