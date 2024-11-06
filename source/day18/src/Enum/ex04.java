package Enum;

public class ex04 {
    public static void main(String[] args) {
        String trans="TAXI";
        //Transportation taxi=Enum.valueOf(Transportation.class,trans);
        //System.out.println(taxi);

        Transportation taxi=Transportation.valueOf("TAXI");
        System.out.println(taxi);
    }
}
