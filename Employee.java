package Library.howemork;

public class Employee {
    private String name;
    private double salary,reise;
    public Employee (String e_name,double c_salary)
    {
        name=e_name;
        salary=c_salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void reisesalary(double bypercant) {
        reise=((salary*bypercant)/100);
        salary=salary+reise;

    }
}
