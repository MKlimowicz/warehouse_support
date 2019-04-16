package model;

import java.util.ArrayList;
import java.util.List;

public class ProductShelf {
   private int id;
   private int number;
   private List<Employee> responsibleEmployees;
   private List<Product> storageShelf;

    public ProductShelf(int number) {
        this.number = number;
        this.responsibleEmployees = new ArrayList<Employee>();
        this.storageShelf = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Employee> getResponsibleEmployees() {
        return responsibleEmployees;
    }

    public void setResponsibleEmployees(List<Employee> responsibleEmployees) {
        this.responsibleEmployees = responsibleEmployees;
    }

    public List<Product> getStorageShelf() {
        return storageShelf;
    }

    public void setStorageShelf(List<Product> storageShelf) {
        this.storageShelf = storageShelf;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "id=" + id +
                ", number=" + number +
                ", responsibleEmployees=" + responsibleEmployees +
                ", storageShelf=" + storageShelf +
                '}';
    }
}
