package innerClass;

public class Outer {
    int num2=20;
    class Inner{
        static int num1; // JDK16 부터 가능
        int num2=10;

        void method(){
            System.out.println("Inner 클래스에 정의된 인스턴스 메서드");
            System.out.printf("num2=%d%n",num2);
            System.out.printf("Outer.num2=%d%n", Outer.this.num2);
        }
    }
}
