package Annotation;

@MyAnno(value="값1")
public class Person {
    @MyAnno(value = "값2")
    private String name;

    @MyAnno(value = "값3")
    public void method(@MyAnno(value = "값4") String title) {

    }
}