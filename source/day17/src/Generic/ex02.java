package Generic;

public class ex02 {
    public static void main(String[] args) {
        Box<Grape> grapeBox=new Box</*Grape*/>(); // Grape 생략가능
        // 객체 생성시 <Grape> Object -> Grape 형변환
    }
}
