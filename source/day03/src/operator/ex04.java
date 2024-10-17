package operator;

public class ex04 {
    public static void main(String[] args) {
        boolean result1 = 10>5;
        System.out.println(result1);

        int num=50;
        boolean result2 = num>=10;
        System.out.println(result2);

        int num50;
        boolean result3 = num>=10;
        boolean result4 = num>=100;

        boolean result5 = result3 && result4;
        System.out.println(result5);

        boolean result6 = num>=10 && num<=100;
        System.out.println(result6);
    }

}
