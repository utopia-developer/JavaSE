package Assignment2.model;

/**
 * 部门类
 */
public class Department {
    private String departmentId;  //部门编号
    private String departmentName;  //部门名称
    private Employee[] employees;  //部门总员工数组
    private int employeeNumber;  //部门员工数量

    //departmentName，departmentId双参构造方法
    public Department(String departmentName, String departmentId) {
        this.setDepartmentName(departmentName);
        this.setDepartmentId(departmentId);
    }

    //getter/setter方法
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    /**
     * 防御性编程，防止员工数组为null
     *
     * @return 员工数组
     */
    public Employee[] getEmployees() {
        if (this.employees == null) {
            employees = new Employee[10];
        }
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    //求员工数量方法
    public void addEmployee(Employee employee) {
        int number;
        for (number = 0; number < this.getEmployees().length; number++) {
            employee.setDepartment(this);
            if (this.getEmployees()[number] == null) {
                this.getEmployees()[number] = employee;
                break;  //传入后break
            }
        }
        this.setEmployeeNumber(number + 1);
    }
}
