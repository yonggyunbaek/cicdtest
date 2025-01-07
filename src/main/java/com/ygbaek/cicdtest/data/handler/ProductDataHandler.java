package com.ygbaek.cicdtest.data.handler;

import com.ygbaek.cicdtest.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);
}
