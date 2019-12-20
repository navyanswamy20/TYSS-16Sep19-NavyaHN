import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductservicesService {

  constructor(private http: HttpClient) { }
  addProducts(add): Observable<any> {
    return this.http.post('http://localhost:8080/stockmanagement/addProduct', add);
  }
  updateProducts(update): Observable<any> {
    return this.http.put(`http://localhost:8080/stockmanagement/modify/${update.pid}`, update);
  }

  deleteProducts(remove): Observable<any> {
    return this.http.delete(`http://localhost:8080/stockmanagement/remove/${remove.pid}`, remove);
  }
  showallProducts(showall): Observable<any> {
    return this.http.get('http://localhost:8080/stockmanagement/allproducts', showall);
  }
  searchProducts(search): Observable<any> {
    return this.http.get(`http://localhost:8080/stockmanagement/findbyname/${search.name}`, search);
  }
}
