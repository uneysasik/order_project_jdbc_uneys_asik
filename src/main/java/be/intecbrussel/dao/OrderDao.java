package be.intecbrussel.dao;

import be.intecbrussel.service.Products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDao {

    private final Connection connection;
    public static String orderNumber;
    Date today = new Date();
    DateFormat f = new SimpleDateFormat("yyyyMM");
    public int orderCount = 0001;

    public void orderNumber(){
        System.out.println("ORD-" + f.format(today) + "-" + orderCount++);
    }

    public OrderDao(Connection connection){
        this.connection=connection;
    }

    public List<Products> getAllProductsFromDB() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT*FROM order_products");

        List<Products> result = new ArrayList<>();

        return result;
    }





    }



