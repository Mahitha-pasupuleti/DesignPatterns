package SingletonPattern;

public class SingletonVersion2 {

    private SingletonVersion2() {}

    private static class SingletonHelper {
        private static final SingletonVersion2 INSTANCE = new SingletonVersion2();
    }

    public static SingletonVersion2 getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
