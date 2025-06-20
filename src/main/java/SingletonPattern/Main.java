package SingletonPattern;

public class Main {
    public static void main(String[] args) {

        Singleton object = Singleton.getInstance();
        System.out.println(object);

        SingletonVersion2 objectV2 = SingletonVersion2.getInstance();
        System.out.println(objectV2);
    }
}
