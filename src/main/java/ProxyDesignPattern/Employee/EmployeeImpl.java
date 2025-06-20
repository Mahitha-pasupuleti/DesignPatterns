package ProxyDesignPattern.Employee;

public class EmployeeImpl implements EmployeeDao {
    private String name;
    private String department;
    private int salary;

    @Override
    public void generateInvoice() {
        System.out.println( "Name: " + getName() + " , Department: " + getDepartment() + " , Salary: $" + getSalary() );
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
