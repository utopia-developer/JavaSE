package part3_Java常用工具类.chapter19_集合.Quiz3_11.model;

public class Student {
    //根据需求完成Student类的定义
    private int stuId;
    private String name;
    private float score;

    public Student(int stuId, String name, float score) {
        this.setStuId(stuId);
        this.setName(name);
        this.setScore(score);
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[学号：" + this.getStuId() +
                ", 姓名：" + this.getName() +
                ", 成绩：" + this.getScore() +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getStuId() != student.getStuId()) return false;
        if (Float.compare(student.getScore(), getScore()) != 0) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getStuId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getScore() != +0.0f ? Float.floatToIntBits(getScore()) : 0);
        return result;
    }
}
