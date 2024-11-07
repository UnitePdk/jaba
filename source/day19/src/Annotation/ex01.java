package Annotation;

import java.lang.reflect.Method;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Class<Person> cls=Person.class;
        MyAnno myAnno=cls.getAnnotation(MyAnno.class);
        System.out.println(myAnno);

        String value= myAnno.value();
        System.out.println(value);

        Method method=cls.getMethod("method", String.class);
        MyAnno myAnno2=method.getAnnotation(MyAnno.class);
        String value2=myAnno2.value();
        System.out.println(value2);
        
//        int max=myAnno2.max();
//        int[] numbers1=myAnno.numbers();
//        int max2=myAnno2.max();
//        int[] numbers2=myAnno.numbers();
    }
}
