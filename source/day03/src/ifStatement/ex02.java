package ifStatement;

public class ex02 {
    public static void main(String[] args) {
        int age=15;

        if (age<8){
            System.out.println("유치원");
        } else if (age<14) { //위 조건이 넘어갔을때만 발동해서 괜찮음
            System.out.println("초등학생");
        } else if (age<17) {
            System.out.println("중학생");
        } else if (age<20) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
