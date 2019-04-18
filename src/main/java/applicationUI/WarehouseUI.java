package applicationUI;

import services.EmployeeServices;
import services.WarehouseServices;

import java.util.Scanner;

public class WarehouseUI {
    public void start(){
        WarehouseServices warehouseServices = new  WarehouseServices();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choose;


        while (flag) {
            System.out.println("Choose what you would like to do: ");
            System.out.println("1.Creating new warehouse");
            System.out.println("2.Print all warehouses");
            System.out.println("3.Update warehouses");
            System.out.println("4.Delete warehouses");
            System.out.println("5.Assigning employee to the warehouse");
            System.out.println("6.EXIT");
            choose = sc.nextInt();


            switch (choose){
                case 1:
                    warehouseServices.creatingNewWarehouse();
                    break;
                case 2:
                    warehouseServices.printAllWarehouse();
                    break;
                case 3:
                    warehouseServices.updateWarehouses();
                    break;
                case 4:
                    warehouseServices.deleteWarehousesById();
                    break;
                case 5:
                    warehouseServices.assigningEmployeeToTheWarehouse();
                    break;
                case 6:
                    flag  = false;
                    break;
            }

        }
    }
}
