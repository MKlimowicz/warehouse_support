package services;

import databasequeries.QueriesWarehouse;
import model.Employee;
import model.Warehouse;

import java.util.List;
import java.util.Scanner;

public class WarehouseServices {
    private QueriesWarehouse queriesWarehouse = new QueriesWarehouse();
    private WarehouseServices warehouseServices = new WarehouseServices();
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private boolean decision;
    private int id;
    private int choose;

    public void creatingNewWarehouse() {

            System.out.println("Give me name new Warehouse: ");
            name = scanner.next();

            decision = queriesWarehouse.creatingNewEmployee(new Warehouse(name));

            if(decision){
                System.out.println("A warehouse named " + name + " was added");
            }else {
                System.out.println("An error occurred while adding");
            }

    }

    public void printAllWarehouse(){
        List<Warehouse> allWarehouses = queriesWarehouse.getAllWarehouses();
        allWarehouses
                .forEach(System.out::println);
    }


    public void updateWarehouses() {

        System.out.println("List warahouses");
        System.out.println("---start---");
        printAllWarehouse();
        System.out.println("---end---");
        System.out.println("Give the person's id to edit: ");
        id = scanner.nextInt();

        Warehouse warehouseById = getWarehouseById(id);

        if(warehouseById != null){
            System.out.println(warehouseById);
            System.out.println("What you want edit ?");
            System.out.println("1.name");
            System.out.println("2.last name");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Give new name: ");
                    name = scanner.next();
                    warehouseById.setName(name);
                    break;
            }

            decision = queriesWarehouse.updateWarehouses(warehouseById);

            if(decision){
                System.out.println("You set new data. Warehouse named " + warehouseById.getName());
            }else {
                System.out.println("An error occurred while set new data");
            }
        }else{
            System.out.println("The warehouse with the given id does not exist");
        }





    }

    public Warehouse getWarehouseById(int id) {
        return queriesWarehouse.getWarehousesById(id);
    }

    public void deleteWarehousesById() {
        System.out.println("Warehouses list");
        System.out.println("--start--");
        printAllWarehouse();
        System.out.println("--end--");
        System.out.println("Give the warehouses id to delete: ");
        id = scanner.nextInt();

        decision = queriesWarehouse.deleteWarehousesById(id);

        if(decision){
            System.out.println("You delete data. Warehouses id: " + id );
        }else {
            System.out.println("An error occurred while delete data");
        }


    }

    public void assigningEmployeeToTheWarehouse() {
        










    }
}
