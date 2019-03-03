package part2_Java面向对象.chapter11_封装综合案例.model;

public class Subject {
    private String subjectName;
    private String subjectId;
    private int subjectYear;

    private Student[] students;
    private int studentNumber;

    public Subject() {

    }

    public Subject(String subjectName, String subjectId, int subjectYear) {
        this.setSubjectName(subjectName);
        this.setSubjectId(subjectId);
        this.setSubjectYear(subjectYear);
    }

    public Subject(String subjectName, String subjectId, int subjectYear, Student[] students) {
        this.setSubjectName(subjectName);
        this.setSubjectId(subjectId);
        this.setSubjectYear(subjectYear);
        this.setStudents(students);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getSubjectYear() {
        return subjectYear;
    }

    public void setSubjectYear(int subjectYear) {
        this.subjectYear = subjectYear;
    }

    /**
     * 防御性编程，防止students为null
     *
     * @return 学习本专业的学生数组
     */
    public Student[] getStudents() {
        if (students == null) {
            students = new Student[200];
        }
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String subjectInfo() {
        String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号： " +
                this.getSubjectId() + "\n学制年限：" + this.getSubjectYear() + "年";
        return str;
    }

    public void addStudent(Student student) {
        int i;
        for (i = 0; i < this.getStudents().length; i++) {
            if (this.getStudents()[i] == null) {
                this.getStudents()[i] = student;
                break;
            }
        }
        this.setStudentNumber(i + 1);
    }

    public void add(Student student) {
        int i;
        for (i = 0; i < this.getStudents().length; i++) {
            if (this.getStudents()[i] == null) {
                //实现学生和专业的双重关联
                student.setStudentSubject(this);
                this.getStudents()[i] = student;
                break;
            }
        }
        this.setStudentNumber(i + 1);
    }
}
