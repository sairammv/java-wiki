package cisco;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

class InvalidInputException extends RuntimeException {

    public InvalidInputException(String message) {
        super(message);
    }

}

class Employee {

    private int id = 0;
    private String name = null;
    private boolean male = true;

    Employee(int id, String name, boolean male) {
        super();
        this.id = id;
        this.name = name;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }


}

public class Test {

    /*
     * Validate the input and create Employee object
     * If any of the given input is not valid throw InvalidInputException();
     */
    public static Employee createEmployee(int id, String name, boolean male) {

        Employee employee = new Employee(id, name, male);

        return employee;

    }

    public static void main(String[] str) {

        //Input is expected as comma separated values for Employee object like id(int), name (String),isMale(boolean)"
        // 1,John,true
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Employee> employeeSet = new LinkedHashSet<>();

        /*Process each line and create Employee object using the "createEmployee" method add in employeeSet*/
        while (scan.hasNextLine()) {
            try {
                String[] employeeData = scan.next().split(",");
                int id = Integer.parseInt(employeeData[0]);
                String name = employeeData[1];
                boolean male = Boolean.parseBoolean(employeeData[2]);
                Employee employee = createEmployee(id, name, male);
                employeeSet.add(employee);

            } catch (Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }
        }

        System.out.println("Employees info : " + employeeSet);



    }

}