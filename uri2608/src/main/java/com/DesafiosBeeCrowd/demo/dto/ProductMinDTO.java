package com.DesafiosBeeCrowd.demo.dto;

import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;

public class ProductMinDTO {

    private Double priceMax;
    private Double priceMin;

    public ProductMinDTO() {

    }

    public ProductMinDTO(Double priceMax, Double priceMin) {
        this.priceMax = priceMax;
        this.priceMin = priceMin;
    }

    public ProductMinDTO(ProductMinProjection projection) {
        this.priceMax = projection.getPriceMax();
        this.priceMin = projection.getPriceMin();
    }

    public Double getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(Double priceMax) {
        this.priceMax = priceMax;
    }

    public Double getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
    }

    @Override
    public String toString() {
        return priceMax + " | " + priceMin;
    }
}
