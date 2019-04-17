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
            System.out.println("1.Creating an warehouse");
            System.out.println("2.EXIT");
            choose = sc.nextInt();


            switch (choose){
                case 1:
                    warehouseServices.creatingNewWarehouse();
                    break;
                case 2:
                    flag  = false;
                    break;
            }

        }
    }
}
