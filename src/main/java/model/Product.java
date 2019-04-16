package model;

public class Product {
    private int id;
    private int barcode;
    private String name;
    private float capacity;
    private float mass;

    public Product(int barcode, String name, float capacity, float mass) {
        this.barcode = barcode;
        this.name = name;
        this.capacity = capacity;
        this.mass = mass;
    }

    public int getId() {
        return id;
    }


    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", barcode=" + barcode +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", mass=" + mass +
                '}';
    }
}
