package com.telusko.ecom_Project.Repo;

import com.telusko.ecom_Project.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {


}


