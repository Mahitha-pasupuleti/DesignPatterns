package ProxyDesignPattern.Employee;

public class EmployeeProxy implements EmployeeDao{

    private String roleName;
    private EmployeeDao employeeDao;
    public EmployeeProxy(String roleName, EmployeeDao employeeDao) {
        this.roleName = roleName;
        this.employeeDao = employeeDao;
    }

    @Override
    public void generateInvoice() {
        if ( roleName.equals( "EMPLOYEE" ) ) {
            employeeDao.generateInvoice();
        } else {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public void setName(String name) {
        if ( roleName.equals( "EMPLOYEE" ) ) {
            employeeDao.setName(name);
        } else {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public void setDepartment(String department) {
        if ( roleName.equals( "ADMIN" ) ) {
            employeeDao.setDepartment(department);
        } else {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public void setSalary(int salary) {
        if ( roleName.equals( "ADMIN" ) ) {
            employeeDao.setSalary(salary);
        } else {
            System.out.println("ACCESS DENIED");
        }
    }

}
