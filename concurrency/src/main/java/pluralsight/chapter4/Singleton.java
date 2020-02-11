package pluralsight.chapter4;

public class Singleton {
    private final static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
//        if(instance == null)
//            instance = new Singleton();
        return instance;
    }
}
