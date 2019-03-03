package part2_Java面向对象.chapter11_封装综合案例.model;

public class Student {
    private String studentName;
    private String studentId;
    private char studentGander;
    private int studentAge;

    private Subject studentSubject;

    public Student(String studentName, String studentId, char studentGander, int studentAge) {
        this.setStudentName(studentName);
        this.setStudentId(studentId);
        this.setStudentGander(studentGander);
        this.setStudentAge(studentAge);
    }

    public Student(String studentName, String studentId, char studentGander, int studentAge, Subject studentSubject) {
        this.setStudentName(studentName);
        this.setStudentId(studentId);
        this.setStudentGander(studentGander);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public char getStudentGander() {
        return studentGander;
    }

    public void setStudentGander(char studentGander) {
        this.studentGander = studentGander;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    /**
     * 防御性编程，防止studentSubject为null
     *
     * @return 学生所修专业
     */
    public Subject getStudentSubject() {
        if (studentSubject == null) {
            this.studentSubject = new Subject();
        }
        return studentSubject;
    }

    public void setStudentSubject(Subject subject) {
        this.studentSubject = subject;
    }

    public String studentInfo() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentId() +
                "\n性别：" + this.getStudentGander() + "\n年龄：" + this.getStudentAge() + "岁";
        return str;
    }

    public String introduce() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentId() + "\n性别：" +
                this.getStudentGander() + "\n年龄：" + this.getStudentAge() + "岁\n所报专业名称：" + this.getStudentSubject().getSubjectName()
                + "\n学制年限：" + this.getStudentSubject().getSubjectYear() + "年";
        return str;
    }
}
