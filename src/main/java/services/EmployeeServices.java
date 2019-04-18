package services;

import databasequeries.QueriesEmployee;
import model.Employee;
import validation.EmployeeValidation;

import java.util.List;
import java.util.Scanner;

public class EmployeeServices {
    private QueriesEmployee queriesEmployee = new QueriesEmployee();
    private EmployeeValidation employeeValidation = new EmployeeValidation();
    private Scanner scanner = new Scanner(System.in);

    private String name;
    private String lastName;
    private int id;
    private boolean decision;
    private int choose;

    public void creatingNewEmployee() {
        System.out.println("Give me name: ");
        name = scanner.nextLine();
        System.out.println("Give me last name: ");
        lastName = scanner.nextLine();

        decision = queriesEmployee.creatingNewEmployee(new Employee(name,lastName));

        if(decision){
            System.out.println("A person named " + name + " and last name " + lastName + " was added");
        }else {
            System.out.println("An error occurred while adding");
        }

    }

    public void printAllEmployeesFromAllWarehouses() {
        List<Employee> allEmplooyeesInCompany = queriesEmployee.getAllEmplooyeesInCompany();

        allEmplooyeesInCompany
                .forEach(System.out::println);

    }

    public Employee getEmployeById(int id){
        return queriesEmployee.getEmployeeById(id);
    }

    public void updateEmployee(){
        System.out.println("Employee list");
        System.out.println("--start--");
        printAllEmployeesFromAllWarehouses();
        System.out.println("--end--");
        System.out.println("Give the person's id to edit: ");
        id = scanner.nextInt();

        Employee employeById = getEmployeById(id);

        if(employeById != null){
            System.out.println(employeById);
            System.out.println("What you want edit ?");
            System.out.println("1.name");
            System.out.println("2.last name");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Give new name: ");
                    name = scanner.next();
                    employeById.setName(name);
                    break;
                case 2:
                    System.out.println("Give new last name: ");
                    lastName = scanner.next();
                    employeById.setLastName(lastName);
                    break;
            }

            decision = queriesEmployee.updateEmployee(employeById);

            if(decision){
                System.out.println("You set new data. Employee named " + employeById.getName()
                        + " and last name " + employeById.getLastName());
            }else {
                System.out.println("An error occurred while set new data");
            }
        }else{
            System.out.println("The person with the given id does not exist");
        }
    }

    public void deleteEmployee() {
        System.out.println("Employee list");
        System.out.println("--start--");
        printAllEmployeesFromAllWarehouses();
        System.out.println("--end--");
        System.out.println("Give the person's id to delete: ");
        id = scanner.nextInt();

        decision = queriesEmployee.deleteEmployeeById(id);

        if(decision){
            System.out.println("You delete data. Employee id: " + id );
        }else {
            System.out.println("An error occurred while delete data");
        }


    }
}
