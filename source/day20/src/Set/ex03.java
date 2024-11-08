package Set;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class ex03 {
    public static void main(String[] args) {
        TreeSet<Book> items=new TreeSet<>();
        // Comparator가 있어야 정렬 기준을 설정할 수 있음
        // Book 클래스에 implements Comparable<Book> 추가
        // 근데 정렬기준 변경 못하는 경우가 많음 ex) String

        items.add(new Book("책3","저자3","출판사3"));
        items.add(new Book("책2","저자2","출판사2"));
        items.add(new Book("책1","저자1","출판사1"));
        items.add(new Book("책4","저자4","출판사4"));
        items.add(new Book("책5","저자5","출판사5"));

        for (Book item:items){
            System.out.println(item);
        }
    }
}
