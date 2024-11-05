package Generic;

/*
public class Box<T> {
    // 컴파일 시 T가 <>클래스로 바뀜
    // private Object item;

    // 정적 변수는 자료형을 무조건 명시해야하기 때문에 제네릭 타입 사용 불가
    // private static T item;
    // 배열을 생성하는 new 연산자도 공간을 미리 계산하기 때문에 배열도 사용 불가
    // private T[] items = new T[3];

    private T item;

    public void setItem(T item){
        this.item=item;
    }
    public Object getItem(){
        return item;
    }

    @Override
    public String toString() {
        return item.info() // 얘를 알수가 없음
    }
}*/
public class Box<T extends Fruit>{
    private Fruit item;

    public void setItem(Fruit item){
        this.item=item;
    }
    public Fruit getItem(){
        return item;
    }
    @Override
    public String toString() {
        return item.info();
    }

}
