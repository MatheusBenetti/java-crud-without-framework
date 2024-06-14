package repository;

import entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductRepository {
    List<Product> findAll() throws SQLException;

    Product findById(int id) throws SQLException;

    void create(Product product) throws SQLException;

    void update(Product product) throws SQLException;

    void delete(int id) throws SQLException;
}
