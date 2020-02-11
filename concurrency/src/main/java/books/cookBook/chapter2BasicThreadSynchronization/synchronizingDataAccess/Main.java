package books.cookBook.chapter2BasicThreadSynchronization.synchronizingDataAccess;

public class Main {
    public static void main(String[] args) {
        PricesInfo pricesInfo = new PricesInfo();
        Reader reader[] = new Reader[5];
        Thread threadReader[] = new Thread[5];

        for(int i=0; i<5; i++){
            reader[i] = new Reader(pricesInfo);
            threadReader[i] = new Thread(reader[i]);
        }
        Writer writer = new Writer(pricesInfo);
        Thread threadWriter = new Thread(writer);

        for(int i=0; i<5; i++){
            threadReader[i].start();
        }
        threadWriter.start();
    }
}
