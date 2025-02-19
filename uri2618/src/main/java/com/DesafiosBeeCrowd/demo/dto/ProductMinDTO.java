package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {

    private String productName;
    private String providerName;
    private String categoryName;

    public ProductMinDTO() {

    }

    public ProductMinDTO(String productName, String providerName, String categoryName) {
        this.productName = productName;
        this.providerName = providerName;
        this.categoryName = categoryName;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.productName = projection.getProductName();
        this.providerName = projection.getProviderName();
        this.categoryName = projection.getCategoryName();
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return productName + " | " + providerName + " | " + categoryName;
    }
}
