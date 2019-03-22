package part3_Java常用工具类.chapter23_输入输出流.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        //创建File对象的多种方式
//        File file = new File("/Users/developer/Documents/git_local/JavaSE/part3_Java常用工具类/chapter23_输入输出流/test.txt");
//        File file = new File("/Users/developer/Documents/git_local/JavaSE/part3_Java常用工具类", "chapter23_输入输出流/test.txt");
        File parent = new File("/Users/developer/Documents/git_local/JavaSE/part3_Java常用工具类/chapter23_输入输出流");
        File file = new File(parent, "test.txt");
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是目录：" + file.isDirectory());
        //创建目录
        File file1 = new File(parent, "test");
        if (!file1.exists()) {
            file1.mkdir();
            System.out.println("目录创建成功！");
        } else {
            System.out.println("目录已存在！");
        }
        //创建多级目录
        File file2 = new File(parent, "test/test1/test2");
        if (!file2.exists()) {
            file2.mkdirs();
            System.out.println("多级目录创建成功！");
        } else {
            System.out.println("多级目录已存在！");
        }
        //创建文件
        File file3 = new File(parent, "test1.txt");
        if (!file3.exists()) {
            try {
                file3.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件创建成功！");
        } else {
            System.out.println("文件已存在！");
        }
    }
}
