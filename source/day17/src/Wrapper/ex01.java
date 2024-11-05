package Wrapper;

public class ex01 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        long num2 = num1.longValue(); // 롱으로 변경

        // 객체 <-> 기본자료형으로 자동 변환(오토박싱, 언박싱)
        Integer num3 = 100; // 오토박싱: Integer - int 자료형이 같지 않아 원래는 안됨
        Integer num4 = num1 + num3; // 언박싱, 오토박싱: 객체간의 연산은 원래 안됨
        System.out.println(num4);
        // 성능저하가 있기때문에 연산할때는 안쓰는게 좋음
    }
}
