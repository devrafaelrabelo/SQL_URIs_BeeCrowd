package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {

    private Double price;

    public ProductMinDTO() {

    }

    public ProductMinDTO(Double price) {
        this.price = price;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.price = projection.getPrice();
    }

    public Double getAveragePrice() {
        return price;
    }

    public void setAveragePrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price + "";
    }
}
