package Finally;

public class ex05 {
    public static void main(String[] args) {
        try(MyResource my1=new MyResource();
        MyResource2 my2=new MyResource2()){

        }catch(Exception e){} // AutoClosable 있기때문에 자동으로 다 지워줌
    }
}
