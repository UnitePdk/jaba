package Dynamic;

import java.lang.reflect.Method;

public class ex01 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls=Class.forName("Dynamic.Person");
        // Class 객체 반환 - 동적으로 클래스의 자원이 데이터 영역으로 로드. 반환값으로 클래스의 정보를 확인할 수 있음
        for(Method method: cls.getMethods()){
            System.out.println(method);
        }
    }
}
