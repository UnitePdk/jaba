package Enum;

public class ex05 {

    public static void main(String[] args) {
        String str1 = Transportation.BUS.getTitle();
        String str2 = Transportation.TAXI.getTitle();
        String str3 = Transportation.SUBWAY.getTitle();
        System.out.printf("str1=%s, str2=%s, str3=%s",str1,str2,str3);
    }
}
