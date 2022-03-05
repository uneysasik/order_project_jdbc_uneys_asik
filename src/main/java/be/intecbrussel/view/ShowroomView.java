package be.intecbrussel.view;

import be.intecbrussel.service.Products;

import java.sql.SQLException;
import java.util.List;

public class ShowroomView {

    private Products products;
    public ShowroomView(Products products) {
        this.products=products;
    }

    public List<Products>getProducts() throws SQLException {
        return products.getAllProducts();
    }

}
