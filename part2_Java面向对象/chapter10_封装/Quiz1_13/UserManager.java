package part2_Java面向对象.chapter10_封装.Quiz1_13;

public class UserManager {
    // 用户信息验证的方法
    public String checkUser(User one, User two) {
        // 判断用户名是否为空，是否一致
        // 判断密码是否为空，是否一致
        if (one.getName().equals("") || two.getName().equals("")) {
            return "用户名为空";
        } else if (!(one.getName().equals(two.getName()))) {
            return "用户名不一致";
        } else {
            if (one.getPassword().equals("") || two.getPassword().equals("")) {
                return "密码为空";
            } else if (!(one.getPassword().equals(two.getPassword()))) {
                return "密码不一致";
            } else {
                return "用户名及密码均一致";
            }
        }
    }
}
