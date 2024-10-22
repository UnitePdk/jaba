package object;

public class ex03 {
    public static void main(String[] args) {
        int result=add(10,20);
    }

    /**
     *
     * @param num1 지역변수
     * @param num2
     */
    static int add(int num1, int num2){
        int result=num1+num2;
        return result;
    }
}
