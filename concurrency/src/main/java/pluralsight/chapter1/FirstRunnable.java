package pluralsight.chapter1;

public class FirstRunnable {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            System.out.println("I am Running in "+ Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        t.setName("My thread");

//        t.start();
        t.run();
    }
}
