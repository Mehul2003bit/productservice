package com.productserviceapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productserviceapi.DTO.FakeProductDto;
import com.productserviceapi.models.Category;
import com.productserviceapi.models.Product;

@Service
public class FakeProductService implements ProductService{
    
    

    @Override
    public Product getproductbyid(long id) {
        FakeProductDto fpdto= restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeProductDto.class);
        Product p=convertToProduct(fpdto);
        return p;
    }

    @Override
    public List<Product> getallproducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getallproducts'");
    }

    @Override
    public Product updateproduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateproduct'");
    }

    @Override
    public Product createproduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createproduct'");
    }

    @Override
    public Product deleteproduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteproduct'");
    }

    @Override
    public Product replaceproduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'replaceproduct'");
    }

    public Product convertToProduct(FakeProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        
        Category category = new Category();
        category.setId(dto.getId());
        category.setTitle(dto.getTitle());
        product.setCategory(category);

        return product;
    }
    
}
