package applicationUI;

import model.Employee;

import java.util.Scanner;

public class UI {

    public void start(){
        EmployeeUI employeeUI = new EmployeeUI();
        WarehouseUI warehouseUI = new WarehouseUI();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choose;


        while (flag) {
            System.out.println("- - - - - Hello in aplication ! - - - - -");
            System.out.println("Choose what you would like to do: ");
            System.out.println("1.Options for employees");
            System.out.println("2.Options for warehouse");
            System.out.println("3.EXIT");
            choose = sc.nextInt();


            switch (choose){
                case 1:
                    employeeUI.start();
                    break;
                case 2:
                    warehouseUI.start();
                    break;
                case 3:
                    flag = false;
                    break;
            }

        }



    }
}
