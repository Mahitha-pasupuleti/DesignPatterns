package ProxyDesignPattern.Employee;

public interface EmployeeDao {
    void generateInvoice();
    void setName(String name);
    void setDepartment(String department);
    void setSalary(int salary);
}
