package Collections;

import java.util.Stack;

public class ex01 {
    public static void main(String[] args) {
        Stack<String> items = new Stack<>();
        items.push("항목1");
        items.push("항목2");
        items.push("항목3");
        items.push("항목4");
        items.push("항목5");

        while(items.size()>0){
            System.out.println(items);
            String item=items.pop();
            System.out.println(item);
        }

        System.out.println(items);
    }
}
