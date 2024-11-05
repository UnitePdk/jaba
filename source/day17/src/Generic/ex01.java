package Generic;

public class ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox= new Box<Apple>();
        appleBox.setItem(new Apple());

        //Apple apple = (Apple)appleBox.getItem(); // 형변환 번거로움, 타입 안정성이 확보되지 않음

        //Object obj=appleBox.getItem();
    }
}
