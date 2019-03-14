package Assignment.Assignment3.model;

public class Lion extends Animal implements IACT {
    private String color;
    private String sex;

    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.setColor(color);
        this.setSex(sex);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String love() {
        String str = "喜欢吃各种肉类";
        return str;
    }

    @Override
    public String skill() {
        String str = "擅长钻火圈";
        return str;
    }

    @Override
    public String act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() +
                "岁\n性别：" + this.getSex() + "\n毛色：" + this.getColor() +
                "\n技能：" + this.skill() + "\n爱好：" + this.love();
        return str;
    }
}
