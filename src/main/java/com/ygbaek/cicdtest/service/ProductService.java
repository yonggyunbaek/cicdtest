package com.ygbaek.cicdtest.service;

import com.ygbaek.cicdtest.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);

}
