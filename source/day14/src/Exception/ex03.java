package Exception;

public class ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        try {
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // NullPointerException


        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // 위에서부터 처리하다가 모르면 상위 클래스로 무조건 처리
            System.out.println(e.getMessage());
        }
        System.out.println("계속 실행됨");
    }
}
