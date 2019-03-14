package Assignment.Assignment3.model;

public class Bear extends Animal implements IACT {
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public String love() {
        String str = "喜欢卖萌";
        return str;
    }

    @Override
    public String skill() {
        String str = "挽着花篮，打着雨伞，自立走秀";
        return str;
    }

    @Override
    public String act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() +
                "岁\n技能：" + this.skill() + "\n爱好：" + this.love();
        return str;
    }
}
