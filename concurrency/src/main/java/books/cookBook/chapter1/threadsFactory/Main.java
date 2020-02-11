package books.cookBook.chapter1.threadsFactory;

// created by: bandypiy
// Date: 10/22/2018

public class Main {

    public static void main(String[] args) {
        MyThreadFactory threadFactory = new MyThreadFactory("MyThreadFactory");
        Task task = new Task();
        Thread thread;
        System.out.println("************ Starting Thread ************ ");
        for (int i=0; i<10; i++){
            thread = threadFactory.newThread(task);
            thread.start();
        }
        System.out.println("Factory Status: \n"+ threadFactory.getStatistic());
    }
}
