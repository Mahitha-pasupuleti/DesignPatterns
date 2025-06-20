package ProxyDesignPattern.Client;

import ProxyDesignPattern.Employee.EmployeeDao;
import ProxyDesignPattern.Employee.EmployeeImpl;
import ProxyDesignPattern.Employee.EmployeeProxy;

public class Admin {
    public void performEmployeeOperations() {

        EmployeeDao employeeDao = new EmployeeImpl();

        EmployeeProxy employee = new EmployeeProxy("EMPLOYEE", employeeDao);
        EmployeeProxy admin = new EmployeeProxy("ADMIN", employeeDao);

        admin.setDepartment("Amazon Payments");
        admin.setName("Mahi"); // Access Denied
        admin.setSalary(150000);

        employee.setName("MAHITHA");
        employee.setDepartment("Amazon CEO"); // Access Denied
        employee.generateInvoice();
    }
}
