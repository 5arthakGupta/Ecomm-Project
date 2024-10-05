package com.sarthak.ecommerceproject.Service;

import com.sarthak.ecommerceproject.model.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}