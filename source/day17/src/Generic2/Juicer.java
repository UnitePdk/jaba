package Generic2;

import java.util.List;

public class Juicer {
//    public static void make(FruitBox<Apple> appleBox){
//        List<Apple> items=appleBox.getItems();
//        System.out.println(items);
//    }
//    public static void make(FruitBox<Grape> grapeBox){
//        List<Grape> items=grapeBox.getItems();
//        System.out.println(items);
//    }
    // <> 안은 컴파일러가 없애기 때문에 중복된 메서드가 정의되서 오류남

    public static void make(FruitBox<? extends Fruit> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static void make2(FruitBox<? super Apple> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit, U extends  Fruit> void make3(FruitBox<T> fruitBox, FruitBox<U> fruitBox2){
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make4(FruitBox<T> fruitBox){
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }
}
