package Assignment2.model;

/**
 * 员工类
 */
public class Employee {
    private String employeeName;  //员工姓名
    private String employeeId;  //员工工号
    private char employeeGander;  //员工性别
    private int employeeAge;  //员工年龄
    private Department department;  //员工所属部门
    private Job job;  //员工职务信息

    //传入全部属性构造方法
    public Employee(String employeeName, String employeeId, char employeeGander, int employeeAge, Department department, Job job) {
        this.setEmployeeName(employeeName);
        this.setEmployeeId(employeeId);
        this.setEmployeeGander(employeeGander);
        this.setEmployeeAge(employeeAge);
        this.setDepartment(department);
        this.setJob(job);
    }

    //getter/setter方法
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    //性别限制
    public char getEmployeeGander() {
        if (employeeGander != '男' && employeeGander != '女') {
            return this.employeeGander = '男';
        }
        return employeeGander;
    }

    public void setEmployeeGander(char employeeGander) {
        this.employeeGander = employeeGander;
    }

    //年龄限制
    public int getEmployeeAge() {
        if (employeeAge < 18 || employeeAge > 65) {
            this.employeeAge = 18;
        }
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {

        this.employeeAge = employeeAge;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    //员工的自我介绍方法
    public String introduce() {
        String str = "姓名：" + this.getEmployeeName() + "\n工号：" + this.getEmployeeId() + "\n性别：" +
                this.getEmployeeGander() + "\n年龄：" + this.getEmployeeAge() + "\n职务：" + this.getDepartment().getDepartmentName()
                + this.getJob().getJobName();
        return str;
    }
}
