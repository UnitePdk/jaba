package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// LinkedList - 수정이 편함
// 옆 요소에 대한 주소로 연결된 구조
// 순서가 변경되는 추가, 삭제도 빠르게 처리됨
// 조회 속도는 비교적 느림
// Queue의 구현체
public class ex02 {
    public static void main(String[] args) {
        List<String> items=new LinkedList<>(); // 앞에는 List, 뒤에는 LinkedList - 다형성
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        Iterator<String> itr=items.iterator();
        while(itr.hasNext()){ // 다음 것이 있으면
            String item=itr.next(); // 다음걸 불러옴
            System.out.println(item);
        }
        // itr=items.iterator(); 한번더 쓰려면 다시 정의
        while(itr.hasNext()){ // 다시 못씀
            String item=itr.next();
            System.out.println(item);
        }

    }
}
