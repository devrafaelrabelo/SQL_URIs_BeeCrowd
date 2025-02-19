package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {


    private String ProductName;
    private String ProviderName;

    public ProductMinDTO() {

    }

    public ProductMinDTO(String productName, String providerName) {
        ProductName = productName;
        ProviderName = providerName;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        ProviderName = projection.getProviderName();
        ProductName = projection.getProductName();
    }

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String providerName) {
        ProviderName = providerName;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    @Override
    public String toString() {
        return  ProductName + " | " + ProviderName;
    }
}
