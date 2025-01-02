package com.telusko.ecom_Project.Controller;

import com.telusko.ecom_Project.Model.Product;
import com.telusko.ecom_Project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin //(origins = "http://localhost:5174")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/home")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public ResponseEntity <List<Product>> getAllProduct(){
        return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping ("/product/{id}")
    public ResponseEntity <Product> getProduct(@PathVariable int id){

        Product product = service.getProductById(id);

        if (product != null)

        return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @GetMapping("/product")
//    public ResponseEntity<List<Product>> getAllProduct(){
//        return ResponseEntity.ok(service.getAllProduct());
//    }

}
