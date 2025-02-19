package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {

    private String productNmae;
    private String categoryName;

    public ProductMinDTO() {

    }

    public ProductMinDTO(String productNmae, String categoryName) {
        this.productNmae = productNmae;
        this.categoryName = categoryName;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.productNmae = projection.getProductName();
        this.categoryName = projection.getCategoryName();
    }

    public String getProductNmae() {
        return productNmae;
    }

    public void setProductNmae(String productNmae) {
        this.productNmae = productNmae;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return productNmae + " | " + categoryName;
    }
}
