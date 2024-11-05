package Generic;

public class ex03 {
    public static void main(String[] args) {
        Box<Apple> appleBox=new Box<>();
        appleBox.setItem(new Apple());

        System.out.println(appleBox);
    }
}
