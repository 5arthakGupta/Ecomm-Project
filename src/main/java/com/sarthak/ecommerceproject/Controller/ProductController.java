package com.sarthak.ecommerceproject.Controller;

import com.sarthak.ecommerceproject.Service.ProductService;
import com.sarthak.ecommerceproject.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    // POST /product
//    Request Body
//    {
//        "title": "Apple airpods",
//            "price": 25000,
//            "description": "Best airpods ever",
//            "image": "https://i.pravatar.cc",
//            "category": "electronic"
//    }


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        //Whenever someone is doing a post request on /product
        //Plz execute this method
        Product postRequestResponse = productService.createProduct(product);
        return postRequestResponse;
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Long productId){
        //Whenever someone is doing a get request on /product/{id}
        //Plz execute this method
        Product currentProduct = productService.getSingleProduct(productId);
        return currentProduct;
    }

    @GetMapping("/products")
    public void getAllProducts(){
        productService.getAllProducts();
    }
}
