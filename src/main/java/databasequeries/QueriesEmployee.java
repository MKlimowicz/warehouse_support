package databasequeries;

import database.Dbutil;
import model.Employee;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class QueriesEmployee {

    List<Employee> employeeList = new ArrayList<>();

    public boolean creatingNewEmployee(Employee employee) {

            final String sqlQuery = "INSERT INTO employee (name,lastName)VALUES(?,?)";
            int amountSaveEmployee = 0;

            try (
                    Connection con = Dbutil.getInstance().getConnection();
                    PreparedStatement preparedStatement = con.prepareStatement(sqlQuery)
            ) {

                preparedStatement.setString(1, employee.getName());
                preparedStatement.setString(2, employee.getLastName());
                amountSaveEmployee = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return amountSaveEmployee > 0;
    }

    public List<Employee> getAllEmplooyeesInCompany(){
        employeeList.clear();

        final String sqlQueary = "SELECT * FROM employee";

        try (
                Connection con = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sqlQueary);

        ) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastName");

                Employee employee = new Employee(name, lastName);
                employee.setId(id);
                employeeList.add(employee);
            }

        } catch (SQLException e) {
            e.getSQLState();
        }

        return employeeList;

    }

    public boolean updateEmployee(Employee employee){

        String sqlQuery = "UPDATE employee SET name = ? , lastName = ? WHERE id = ?";
        int updateEmployees = 0;
        try (
                Connection conn = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)
        ) {

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setInt(3, employee.getId());
            updateEmployees = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return updateEmployees > 0;

    }

    public Employee getEmployeeById(int id) {
        Employee employee = null;
        final String sqlQueary = "SELECT * FROM employee where id = ?";

        try (
                Connection con = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(sqlQueary);

        ) {
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastName");

                employee = new Employee(name, lastName);
                employee.setId(id);

            }

        } catch (SQLException e) {
            e.getSQLState();
        }

        return employee;
    }

    public boolean deleteEmployeeById(int id) {
        String sqlQuery = "DELETE FROM employee WHERE id = ?";

        int deleteEmployee = 0;
        try (
                Connection conn = Dbutil.getInstance().getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)
        ) {

            preparedStatement.setInt(1, id);
            deleteEmployee = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return deleteEmployee > 0;

    }
}
