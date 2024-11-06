package Generic2;

public class ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox=new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        Juicer.make2(appleBox);

        FruitBox<Fruit> grapeBox=new FruitBox<>(); // Grape는 안됨
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        Juicer.make2(grapeBox);
    }
}
