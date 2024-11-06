package Enum;

public class ex03 {
    public static void main(String[] args) {
        String str=Transportation.BUS.name();
        // Enum 클래스에 정의된 메서드 String name() - enum 상수->문자->다른 플랫폼에 전달
        System.out.println(str);

        //int ordinal(): 상수가 정의된 순서 번호 - 타 플랫폼 자제. 내부에서만 주로 사용
    }
}
