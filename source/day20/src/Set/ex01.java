package Set;

import java.util.HashSet;

public class ex01 {
    public static void main(String[] args) {
        // Set - 중복을 없앰. 순서는 없음
        HashSet<String> items=new HashSet<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름2");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");
        System.out.println(items);
    }
}
