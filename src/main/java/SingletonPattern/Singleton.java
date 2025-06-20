package SingletonPattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if ( instance == null ) {
            // System.out.println("TESTING V1");
            instance = new Singleton();
        }
        return instance;
    }
}
