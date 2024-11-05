package Wrapper;

public class ex02 {
    public static void main(String[] args) {
        // 안쓰는 이유
        Integer num1=new Integer(10);
        Integer num2=new Integer(10);

        System.out.printf("num1 주소: %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소: %d%n", System.identityHashCode(num2));
        // 같은 값인데 주소가 다름

        Integer num3=Integer.valueOf(10);
        Integer num4=Integer.valueOf(10);
        System.out.printf("num3 주소: %d%n", System.identityHashCode(num3));
        System.out.printf("num4 주소: %d%n", System.identityHashCode(num4));
        // 이렇게 하면 주소가 같아서 메모리 이득

    }
}
