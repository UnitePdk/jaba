package Set;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private final String title;
    private final String author;
    private final String publisher;

    // Alt+Insert로 생성자 빠르게 추가
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        //return title.hashCode() - o.title.hashCode(); // 오름차순 정렬
        //return o.title.hashCode() - title.hashCode(); // 내림차순 정렬
        return title.compareTo(o.title); // 컴팩트한 오름차순
        //return -title.compareTo(o.title); // 컴팩트한 내림차순
    }
}
