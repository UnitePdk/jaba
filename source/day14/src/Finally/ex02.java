package Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("src/a.txt");
            fis.close();
            System.out.println("자원 해제 완료");

        } catch (IOException e){
            e.printStackTrace();
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e2){}
            }
            System.out.println("자원 해제 완료");
        }
        System.out.println("진행");
    }
}
