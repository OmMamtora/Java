package OOPS;

//Encapsulation means wrapping a data in a single unit.

//Whenever you create data member private then that member you can not access out of that class..

//For access that member you have to use get and set method.
//Get method is use for return data and set method is use to set a data.

class Employee {
    private int empId;
    String empName;
    private int salary;

    int getempId() {
        return empId;
    }

    void setempId(int id) {
        empId = id;
    }

    int getsalary() {
        return salary;
    }

    void setsalary(int income) {
        this.salary = income;
    }
}

public class Encapsulation_2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setempId(76);
        System.out.println(emp.getempId());
        emp.empName = "Om";
        System.out.println(emp.empName);
        emp.setsalary(75000);
        System.out.println(emp.getsalary());
    }

}
