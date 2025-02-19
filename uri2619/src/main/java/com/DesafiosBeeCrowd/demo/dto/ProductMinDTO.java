package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {

    private String productName;
    private String providerName;
    private Double productPrice;

    public ProductMinDTO() {

    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.productName = projection.getProductName();
        this.providerName = projection.getProviderName();
        this.productPrice = projection.getProductPrice();
    }

    public ProductMinDTO(String productName, String providerName, Double productPrice) {
        this.productName = productName;
        this.providerName = providerName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return productName +  " | " + providerName + " | " + productPrice;
    }
}
