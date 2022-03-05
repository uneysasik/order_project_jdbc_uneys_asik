package be.intecbrussel;

import java.sql.*;


public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys", "uneys", "uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_table(order_number,order_client,order_delivery_address,order_delivery_postalcode,order_delivery_city,is_vat_free,is_send,order_date) " +
                            "VALUES(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, "ORD-202203-0001");
            preparedStatement.setString(2, "John");
            preparedStatement.setString(3, "Sint-job");
            preparedStatement.setInt(4, 9000);
            preparedStatement.setString(5, "Gent");
            preparedStatement.setBoolean(6, true);
            preparedStatement.setBoolean(7, true);
            preparedStatement.setDate(8, Date.valueOf("2022-01-02"));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_table(order_number,order_client,order_delivery_address,order_delivery_postalcode,order_delivery_city,is_vat_free,is_send,order_date) " +
                            "VALUES(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, "ORD-202203-0002");
            preparedStatement.setString(2, "Michael");
            preparedStatement.setString(3, "Sint-job2");
            preparedStatement.setInt(4, 8500);
            preparedStatement.setString(5, "Kortrijk");
            preparedStatement.setBoolean(6, true);
            preparedStatement.setBoolean(7, true);
            preparedStatement.setDate(8,  Date.valueOf("2022-01-03"));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_table(order_number,order_client,order_delivery_address,order_delivery_postalcode,order_delivery_city,is_vat_free,is_send,order_date) " +
                            "VALUES(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, "ORD-202203-0003");
            preparedStatement.setString(2, "Dirk");
            preparedStatement.setString(3, "Sint-job3");
            preparedStatement.setInt(4, 1000);
            preparedStatement.setString(5, "Brussel");
            preparedStatement.setBoolean(6, true);
            preparedStatement.setBoolean(7, true);
            preparedStatement.setDate(8,  Date.valueOf("2022-01-04"));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_table(order_number,order_client,order_delivery_address,order_delivery_postalcode,order_delivery_city,is_vat_free,is_send,order_date) " +
                            "VALUES(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, "ORD-202203-0003");
            preparedStatement.setString(2, "Daisy");
            preparedStatement.setString(3, "Sint-job4");
            preparedStatement.setInt(4, 9300);
            preparedStatement.setString(5, "Aalst");
            preparedStatement.setBoolean(6, true);
            preparedStatement.setBoolean(7, true);
            preparedStatement.setDate(8,  Date.valueOf("2022-01-05"));
            preparedStatement.executeUpdate();




        } catch (SQLException e) {
            e.printStackTrace();
        }
// PRODUCTS
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );
            Statement statement = connection.createStatement();



            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_products(order_id,product_name,amount,price_per_unit)" +
                            "VALUES(?,?,?,?)");
            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "A Series");
            preparedStatement.setString(3, "3");
            preparedStatement.setInt(4, 25000);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_products(order_id,product_name,amount,price_per_unit) " +
                            "VALUES(?,?,?,?)");
            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "C Series");
            preparedStatement.setString(3, "5");
            preparedStatement.setInt(4, 35000);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_products(order_id,product_name,amount,price_per_unit) " +
                            "VALUES(?,?,?,?)");
            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "E Series");
            preparedStatement.setString(3, "2");
            preparedStatement.setInt(4, 45000);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://moktok.intecbrussel.org:33061/uneys","uneys","uneys2021"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO order_products(order_id,product_name,amount,price_per_unit) " +
                            "VALUES(?,?,?,?)");
            preparedStatement.setString(1, "4");
            preparedStatement.setString(2, "S Series");
            preparedStatement.setString(3, "1");
            preparedStatement.setInt(4, 75000);

            preparedStatement.executeUpdate();

            
            statement.execute("UPDATE order_products SET amount=2, price_per_unit=80000 WHERE product_name='S Series'");
            

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}