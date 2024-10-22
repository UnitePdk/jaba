package object;

public class ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "pdk";
        s1.major = "자바";

        Student s2 = new Student();
        s2.id=1001;
        s2.name="암용제";
        s2.major="영어";

        s1.study();
        s2.study();

        System.out.printf("s1 주소: %d%n", System.identityHashCode(s1));
        System.out.printf("s2 주소: %d%n", System.identityHashCode(s2));


        //System.out.println(System.identityHashCode(s1)); // 해시코드(주소)
    }
}
