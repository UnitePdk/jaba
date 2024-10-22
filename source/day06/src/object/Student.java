package object;

public class Student {
    int id;
    String name;
    String major;

    void study(){
        System.out.printf("%s(%d)이(가) %s를 전공한다.%n", name, id, major);
    }
}
