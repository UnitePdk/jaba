package conversion;

public class ex01 {
    public static void main(String[] args) {
        long num1=100L;
        float num2=num1;
        double num3=num2;
        //실수는 모든 정수를 포함함
        //자동형변환: byte(1) > short(2) > int(4) > long(8) > float(4) > double(8)
    }
}
