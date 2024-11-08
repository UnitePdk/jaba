package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex04 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        ListIterator<String> iter=items.listIterator();
        while(iter.hasNext()){ // 다음이 있으면 - 순방향 조회
            String item=iter.next();
            int index=iter.nextIndex();
            System.out.printf("%d. %s%n", index, item);
        }
        while(iter.hasPrevious()){ // 탐색 커서가 끝에 가있어야 사용 가능함
            String item=iter.previous();
            int index=iter.previousIndex()+2;
            System.out.printf("%d. %s%n", index, item);
        }
    }
}
