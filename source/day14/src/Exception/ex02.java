package Exception;

public class ex02 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;

        try {
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // NullPointerException

            // 다형성을 이용한 다중 예외 처리
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("계속 실행됨");
    }

}
