package controller;

import entity.Product;
import service.ProductService;

import java.sql.SQLException;

public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Product findById(int id) throws SQLException {
        return productService.findById(id);
    }
}
