import { Component } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';
import { Product } from 'src/app/models/product';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html'
})
export class ProductFormComponent {

  product: Product = {
    name: '',
    price: 0
  };

  constructor(private productService: ProductService) {}

  saveProduct() {
    this.productService.addProduct(this.product).subscribe(() => {
      alert('Product added!');
      this.product = { name: '', price: 0 };
    });
  }
}