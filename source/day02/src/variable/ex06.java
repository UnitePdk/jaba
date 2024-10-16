package variable;

public class ex06 {
    public static void main(String[] args) {
        double num1=10.1234;
        //float num2=10.1234;
        //float는 4byte,  double은 8byte
        float num2=11.1234f;
        num1=num2;
        //실수는 double 기본으로 인식함
    }
}
