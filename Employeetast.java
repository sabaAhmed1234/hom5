package Library.howemork;

public class Employeetast {
    public static void main(String[] args) {
        Employee emp=new Employee("SABA",1000);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.reisesalary(emp.getSalary());
    }
}
