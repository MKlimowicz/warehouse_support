package databasequeries;

import database.Dbutil;
import model.Employee;
import model.Warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueriesWarehouse {

    List<Warehouse> warehouseList = new ArrayList<>();

    public boolean creatingNewEmployee(Warehouse warehouse) {
        final String sqlQuery = "INSERT INTO warehouse (name)VALUES(?)";
        int amountSaveWarehouse = 0;

        try (
                Connection con = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sqlQuery)
        ) {

            preparedStatement.setString(1, warehouse.getName());
            amountSaveWarehouse = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return amountSaveWarehouse > 0;
    }

    public List<Warehouse> getAllWarehouses(){
        warehouseList.clear();

        final String sqlQueary = "SELECT * FROM warehouse";

        try (
                Connection con = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sqlQueary);
        ) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                Warehouse warehouse = new Warehouse(name);
                warehouse.setId(id);
                warehouseList.add(warehouse);
            }

        } catch (SQLException e) {
            e.getSQLState();
        }

        return warehouseList;
    }


    public boolean updateWarehouses(Warehouse warehouse) {
        String sqlQuery = "UPDATE warehouse SET name = ? WHERE id = ?";
        int updateWarehouse = 0;
        try (
                Connection conn = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)
        ) {

            preparedStatement.setString(1, warehouse.getName());
            preparedStatement.setInt(2, warehouse.getId());
            updateWarehouse = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return updateWarehouse > 0;
    }

    public Warehouse getWarehousesById(int id) {
        Warehouse warehouse = null;
        final String sqlQueary = "SELECT * FROM warehouse where id = ?";

        try (
                Connection con = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sqlQueary);

        ) {
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                warehouse = new Warehouse(name);
                warehouse.setId(id);
            }

        } catch (SQLException e) {
            e.getSQLState();
        }

        return warehouse;
    }

    public boolean deleteWarehousesById(int id) {
        String sqlQuery = "DELETE FROM warehouse WHERE id = ?";

        int deleteWarehouses = 0;
        try (
                Connection conn = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)
        ) {

            preparedStatement.setInt(1, id);
            deleteWarehouses = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return deleteWarehouses > 0;

    }
}
