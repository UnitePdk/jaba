package Set;

import java.util.HashSet;

public class ex02 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        for (int i=1; i<=10; i++){
            books.add(new Book("책"+i,"저자"+i,"출판사"+i));
        }
        books.add(new Book("책2","저자2","출판사2"));
        // Book 클래스에서 동일한 자료로 판정하는 기준이 없음 - 아직 중복해서 추가됨
        // Book 클래스에 hashCode 추가하면 기준이 생김

        // Books 출력
        for (Book book:books){
            System.out.println(book);
        }
    }
}
