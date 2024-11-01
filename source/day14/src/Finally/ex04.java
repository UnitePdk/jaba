package Finally;

import java.io.FileInputStream;
import java.io.IOException;

public class ex04 {
    public static void main(String[] args) {
        // close() 자동 호출해서 자동으로 자원 해제
        try(FileInputStream fis = new FileInputStream("a.txt")){

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
