package service;

import entity.Product;
import repository.ProductRepository;

import java.sql.SQLException;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(int id) throws SQLException {
        return productRepository.findById(id);
    }
}
