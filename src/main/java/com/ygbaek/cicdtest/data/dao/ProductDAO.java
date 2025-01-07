package com.ygbaek.cicdtest.data.dao;

import com.ygbaek.cicdtest.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);

}
