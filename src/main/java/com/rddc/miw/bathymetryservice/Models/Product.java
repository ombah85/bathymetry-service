package com.rddc.miw.bathymetryservice.Models;

public class Product {

    private final String productUrl;
    private final String description;

    public Product(String productUrl, String description) {
        this.description = description;
        this.productUrl = productUrl;
    }

    public String getProductUrl() { return this.productUrl; }
    public String getDescription() { return this.description; }
}
