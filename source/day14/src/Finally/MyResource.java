package Finally;

public class MyResource implements AutoCloseable {
    // 자동으로 해제되게 해줌
    @Override
    public void close() throws Exception {
        System.out.println("MyResource 자원 해제");
    }
}
