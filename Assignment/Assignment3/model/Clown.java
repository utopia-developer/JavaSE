package Assignment.Assignment3.model;

public class Clown implements IACT {
    private String name;
    private int time;

    public Clown(String name, int time) {
        this.setName(name);
        this.setTime(time);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String dress() {
        String str = "身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
        return str;
    }

    @Override
    public String skill() {
        String str = "脚踩高跷，进行杂技魔术表演";
        return str;
    }

    @Override
    public String act() {
        String str = "表演者：" + this.getName() + "\n艺龄：" + this.getTime() +
                "年\n着装：" + this.dress() + "\n技能：" + this.skill();
        return str;
    }
}
