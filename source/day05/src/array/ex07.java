package array;

public class ex07 {
    static int num1;
    static double num2;
    static boolean result;

    static String str; // 참조 변수

    public static void main(String[] args) {
        System.out.printf("num1: %d%n",num1); // 기본값 0
        System.out.printf("num2: %f%n",num2); // 기본값 0.0
        System.out.printf("result: %s%n",result); // false

        System.out.printf("str: %s%n", str); // null
    }
}
