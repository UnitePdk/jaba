package Exception;

public class ex01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;

        try {
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // NullPointerException

            // | 로 여러개 한번에
        }catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("계속 실행됨");
    }
}
