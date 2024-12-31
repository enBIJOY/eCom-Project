package com.telusko.ecom_Project.Controller;

import com.telusko.ecom_Project.Model.Product;
import com.telusko.ecom_Project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:5174")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/home")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }

//    @GetMapping("/product")
//    public ResponseEntity<List<Product>> getAllProduct(){
//        return ResponseEntity.ok(service.getAllProduct());
//    }

}
