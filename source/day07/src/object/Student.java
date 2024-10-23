package object;

import java.util.function.DoubleFunction;

public class Student {
    int id;
    String name;
    String major;

    public Student() {
        // 기본 생성자
        // 객체 생성 완료 이후 실행하는 코드
        id = 1000;
        name = "pdk";
        major = "수학";
    }

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    }

    void showInfo() {
        System.out.printf("id: %d, name: %s, major: %s%n", id, name, major);
    }
}