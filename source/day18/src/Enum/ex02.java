package Enum;

public class ex02 {
    public static void main(String[] args) {
        Transportation trans= Transportation.BUS;
        switch(trans){
            case BUS:
                System.out.println("버스");
                break;
            case SUBWAY:
                System.out.println("지하철");
                break;
            case TAXI:
                System.out.println("택시");
                break;
        }
    }
}
