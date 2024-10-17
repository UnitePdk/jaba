package operator;

public class ex06 {
    public static void main(String[] args) {
        System.out.println("가나"+"다라");

        int num=10;
        //삼항 조건문 - 조건 ? 참 : 거짓
        String result = num == 10 ? "10입니다." : "10이 아닙니다.";
        System.out.println(result);

        boolean result1=true;
        boolean result2=!result1;
        System.out.println(result2);

        boolean result3=!result2;
        System.out.println(result3);
    }
}
