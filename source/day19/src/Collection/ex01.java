package Collection;

import java.util.ArrayList;

public class ex01 {
    public static void main(String[] args) {
        // ArrayList - 콜렉션 구조 중에 스택에 최적화된 구조
        ArrayList<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

//        for (int i=0; i<items.size(); i++){
//            String item=items.get(i);
//            System.out.println(item);
//        }

        // 빼기 - 스택구조와 동일하게 뒤에서부터 빼야함
        for (int i=items.size() - 1; i>= 0;i--){
            String item=items.remove(i);
            System.out.println(item);
        }

        System.out.println(items);
    }
}
