package Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // finally로 메모리 삭제
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }
            System.out.println("자원 해제 완료");
        }
        System.out.println("진행");
    }
}
