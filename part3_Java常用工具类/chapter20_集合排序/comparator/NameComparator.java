package part3_Java常用工具类.chapter20_集合排序.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        //按名字升序排列
        return name1.compareTo(name2);
    }
}
