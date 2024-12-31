package com.telusko.ecom_Project.Service;


import com.telusko.ecom_Project.Model.Product;
import com.telusko.ecom_Project.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;


    public List<Product> getAllProduct() {
    return repo.findAll();

    }
}
