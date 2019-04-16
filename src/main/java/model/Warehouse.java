package model;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private int id;
    private String name;

    private List<ProductShelf> shelvesInTheCompany;
    private List<Employee> employeeList;
    private List<Product> productList;

    public Warehouse() {
        this.shelvesInTheCompany = new ArrayList<ProductShelf>();
        this.employeeList = new ArrayList<Employee>();
        this.productList = new ArrayList<Product>();
    }

    public List<ProductShelf> getShelvesInTheCompany() {
        return shelvesInTheCompany;
    }

    public void setShelvesInTheCompany(List<ProductShelf> shelvesInTheCompany) {
        this.shelvesInTheCompany = shelvesInTheCompany;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void printProductList(){
        productList
                .forEach(System.out::println);
    }
    public void printEmployeeList(){
        employeeList
                .forEach(System.out::println);
    }

    public void printShelvesInTheCompany(){
        shelvesInTheCompany
                .forEach(System.out::println);
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
