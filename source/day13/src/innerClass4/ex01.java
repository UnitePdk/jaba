package innerClass4;

public class ex01 {
    public static void main(String[] args) {
        Outer out=new Outer();
        Calculator cal=out.method(30);
        int result= cal.add(10,20);
        System.out.println(result);

//        public int add(int num1, int num2){
//            //return num1-num2;
//        }
    }
}
