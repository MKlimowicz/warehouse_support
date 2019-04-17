package applicationUI;

import model.Employee;

import java.util.Scanner;

public class UI {

    public void start(){
        EmployeeUI employeeUI = new EmployeeUI();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int choose;


        while (flag) {
            System.out.println("- - - - - Hello in aplikacji ! - - - - -");
            System.out.println("Choose what you would like to do: ");
            System.out.println("1.Options for employees");
            System.out.println("2.EXIT");
            choose = sc.nextInt();


            switch (choose){
                case 1:
                    employeeUI.start();
                    break;
                case 2:
                    flag = false;
                    break;
            }

        }



    }
}
