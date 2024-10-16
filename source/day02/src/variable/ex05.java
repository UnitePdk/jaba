package variable;

public class ex05 {
    public static void main(String[] args) {
        //long num1=1000000000000; 우측의 리터럴을 int로 인식함
        long num1=10000000000L;
        long num2=1_0000_0000_0000L;
        int num3=1_000_000;
        //int가 정수중에선 변환을 거치지 않아 가장 효율적임
    }
}
