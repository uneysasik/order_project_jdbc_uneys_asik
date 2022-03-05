package be.intecbrussel.service;

import be.intecbrussel.dao.OrderDao;

import java.sql.SQLException;
import java.util.List;

public class Products {
    private OrderDao dao;

    public Products(OrderDao orderDao) {
        this.dao=orderDao;
    }
    public List<Products> getAllProducts() throws SQLException {
        return this.dao.getAllProductsFromDB();
    }



}
