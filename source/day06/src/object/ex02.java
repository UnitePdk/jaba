package object;

public class ex02 {
    public static void main(String[] args) {
        int result=calc(3);
        System.out.println(result);
    }

    static int calc(int x) {
        int y = x * 2 + 3;
        return y;
    }
}
