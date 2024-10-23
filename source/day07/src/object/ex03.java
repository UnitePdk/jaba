package object;

public class ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "pdk", "자바");
        Student s2 = new Student(1001, "암용제", "데이터베이스");
        s1.showInfo();
        s2.showInfo();
    }
}
