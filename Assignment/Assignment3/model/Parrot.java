package Assignment.Assignment3.model;

public class Parrot extends Animal implements IACT {
    private String type;

    public Parrot(String name, int age, String type) {
        super(name, age);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String love() {
        String str = "喜欢吃坚果和松子";
        return str;
    }

    @Override
    public String skill() {
        String str = "擅长模仿";
        return str;
    }

    @Override
    public String act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n品种："
                + this.getType() + "\n技能：" + this.skill() + "\n爱好：" + this.love();
        return str;
    }
}
