package part3_Java常用工具类.chapter20_集合排序.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        //按年龄降序排列
        return age2-age1;
    }
}
