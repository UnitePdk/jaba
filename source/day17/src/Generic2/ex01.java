package Generic2;

public class ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox=new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        Juicer.make(appleBox); //Juicer.<Apple>make(appleBox);

        FruitBox<Grape> grapeBox=new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        Juicer.make(grapeBox);

//        FruitBox<Toy> toyBox=new FruitBox<>(); <? extends로 막힘>
//        toyBox.add(new Toy());
//        toyBox.add(new Toy());
//        Juicer.make(toyBox);
    }
}
