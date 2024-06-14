package router;

import controller.ProductController;
import entity.Product;

import java.sql.SQLException;

public class ProductRouter {
    private final ProductController productController;

    public ProductRouter(ProductController productController) {
        this.productController = productController;
    }

    public Product router(String path) throws SQLException {
        String idRegex = "^\\d+$";
        if (path.equals("/products/{id}") && path.substring(path.lastIndexOf("/") + 1).matches(idRegex)) {
            try {
                int id = Integer.parseInt(path.substring(path.lastIndexOf("/") + 1));
                return productController.findById(id);
            } catch (NumberFormatException e) {
                return null;
            }
        } else {
            return null;
        }
    }
}