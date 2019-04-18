package applicationUI;

import services.EmployeeServices;

import java.util.Scanner;

public class EmployeeUI {

    public void start(){
        EmployeeServices employeeServices = new EmployeeServices();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choose;


        while (flag) {
            System.out.println("Choose what you would like to do: ");
            System.out.println("1.Creating an employee");
            System.out.println("2.Print all employees from all warehouses");
            System.out.println("3.Update employee");
            System.out.println("4.Delete employee");
            System.out.println("5.EXIT");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    employeeServices.creatingNewEmployee();
                    break;
                case 2:
                    employeeServices.printAllEmployeesFromAllWarehouses();
                    break;
                case 3:
                    employeeServices.updateEmployee();
                    break;
                case 4:
                    employeeServices.deleteEmployee();
                    break;
                case 5:
                    flag  = false;
                    break;
            }

        }
    }
}
