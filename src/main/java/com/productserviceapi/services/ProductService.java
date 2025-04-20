package com.productserviceapi.services;
import java.util.*;
import com.productserviceapi.models.Product;


public interface ProductService {
    Product getproductbyid(long id);
    List<Product> getallproducts();
    Product updateproduct();
    Product createproduct();
    Product deleteproduct();
    Product replaceproduct();
}