package model;

import java.util.ArrayList;
import java.util.List;

public class ProductShelf {
   private int id;
   private int numer;
   private List<Employee> responsibleEmployees;
   private List<Product> storageShelf;

    public ProductShelf(int numer) {
        this.numer = numer;
        this.responsibleEmployees = new ArrayList<Employee>();
        this.storageShelf = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
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
                ", numer=" + numer +
                ", responsibleEmployees=" + responsibleEmployees +
                ", storageShelf=" + storageShelf +
                '}';
    }
}
