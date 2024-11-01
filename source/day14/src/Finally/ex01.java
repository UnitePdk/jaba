package Finally;

public class ex01 {
    public static void main(String[] args) {
        int result=add(10,20);
    }
    static int add(int num1, int num2){
        try {
            return num1 + num2;
        } finally {
            System.out.println("무조건 실행");
        }

    }
}
