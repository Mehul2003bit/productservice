package com.productserviceapi.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductDto {
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;

    
}
