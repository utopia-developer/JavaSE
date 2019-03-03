package part2_Java面向对象.chapter10_封装.Quiz1_13;

public class User {
    //定义属性用户名、密码
    private String name;
    private String password;

    public User(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
