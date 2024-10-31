package innerClass4;

public class Outer {
    public Calculator method(int num3){
        Calculator cal=new Calculator() {

            public int add(int num1, int num2) {
                // 지역변수의 상수화 - 값을 제거하지 않을 목적
                return num1+num2+num3;
            }
        };
        return cal;

//        int result=cal.add(10,20);
//        System.out.println(result);
    }
    //int result=cal.add(10,20);
}
