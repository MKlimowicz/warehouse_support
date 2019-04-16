package model;

public class Product {
    private int id;
    private int barcode;
    private String name;
    private float capacity;
    private float mass;
    private int storageShelf;

    public Product(int barcode, String name, float capacity, float mass, int storageShelf) {
        this.barcode = barcode;
        this.name = name;
        this.capacity = capacity;
        this.mass = mass;
        this.storageShelf = storageShelf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getStorageShelf() {
        return storageShelf;
    }

    public void setStorageShelf(int storageShelf) {
        this.storageShelf = storageShelf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", barcode=" + barcode +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", mass=" + mass +
                ", storageShelf=" + storageShelf +
                '}';
    }
}
