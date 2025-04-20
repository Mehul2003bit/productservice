package com.productserviceapi.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productserviceapi.models.Product;

@RestController
@RequestMapping("/Products")

public class ProductController {

    @GetMapping("/products/id")
    public Product getproductid(@PathVariable("id") long id){
        return new Product();
    }

    @GetMapping("/products")
    public List<Product> getallproducts(){
        return new ArrayList<>();
    }

    @PostMapping
    public Product createproduct(@RequestBody Product product){
        return new Product();
    }

    @PutMapping("/id")
    public Product replaceproduct(@PathVariable("id") long id,@RequestBody Product product){
        return new Product();
    }

    @PatchMapping("/id")
    public Product updateproduct(@PathVariable("id") long id,@RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/id")
    public Product deleteproduct(@PathVariable Product product){
        return new Product();
    }
}
