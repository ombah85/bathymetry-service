package com.rddc.miw.bathymetryservice.api;

import com.rddc.miw.bathymetryservice.Models.Product;
import com.rddc.miw.bathymetryservice.Models.ProductMetadata;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${productUrl}")
    private String productUrl;

    @Value("${productDescription}")
    private String productDescription;

    @Value("${extent}")
    public String extent;

    @Value("${resolution}")
    public String resolution;

    @Value("${productionDate}")
    public String productionDate;

    @Value("${Size}")
    public String Size;

    @GetMapping("/")
    public String getServiceDescription(){
        return "Bathymetry Service";
    }

    @GetMapping("/productUrl")
    public String getProductUrl(){
        return productUrl;
    }

    @GetMapping("/productmetadata")
    public ProductMetadata getMetadata() {
        return new ProductMetadata(extent, resolution, productionDate, Size);
    }
}
