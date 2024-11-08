package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class ex04 {
    public static void main(String[] args) {
        Comparator<String> comp=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순
            }
        };

//        TreeSet<String> items= new TreeSet<>(comp);
        TreeSet<String> items= new TreeSet<>(Comparator.reverseOrder()); // 컴팩트 내림차순

        items.add("이름1");
        items.add("이름3");
        items.add("이름2");
        items.add("이름5");
        items.add("이름4");

        System.out.println(items);
    }
}
