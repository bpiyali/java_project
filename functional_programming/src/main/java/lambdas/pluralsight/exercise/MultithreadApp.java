package lambdas.pluralsight.exercise;

/**
 * In our MultithreadApp class, we created a Thread called thread1 that prints "Thread #1 is running" when it's started. We used an anonymous Runnable class to create thread1. Now, we want to create a second Thread using a Lambda Expression.
 *
 *
 * In the MultithreadApp() constructor, initialize thread2 with a new Thread constructor, and pass a Lambda Expression that prints "Thread #2 is running".
 * Finally, in startThreads(), call start() on thread2 to run the second process.
 * (Hint: Since run() takes 0 parameters, empty parentheses () will be used in front of the arrow like so: () -> ...).
 *
 */
public class MultithreadApp {
    Thread thread1;
    Thread thread2;

    public MultithreadApp() {
        thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread #1 is running");
            }
        });

        // Task 1
        thread2 = new Thread(() -> System.out.println("Thread #2 is running"));
//        thread2 = new Thread(System.out::println);
    }

    public void startThreads() {
        thread1.start();
        // Task 2
        thread2.start();

    }

    public static void main(String[] args) {
        MultithreadApp multithreadApp = new MultithreadApp();
        multithreadApp.startThreads();

    }
}
