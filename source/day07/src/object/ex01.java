package object;

public class ex01 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=1000;
        s1.name="pdk";
        s1.major="수학";

        s1.showInfo();

        Student s2=s1;
        s2.name="암용제";
        s2.showInfo();
        s1.showInfo();
    }
}
