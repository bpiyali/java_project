package books.cookBook.chapter1.threadsFactory;

// created by: bandypiy
// Date: 10/22/2018

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {

    private String name;
    private int counter;
    private List<String> status;

    public MyThreadFactory(String name) {
        this.counter = 0;
        this.name = name;
        this. status = new ArrayList<String>();
    }

    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, name+"-Thread-"+counter);
        counter++;
        status.add(String.format("Created Thread: %d with name: %s on %s", thread.getId(), thread.getName(), new Date()));
        return thread;
    }

    public String getStatistic(){
        StringBuffer sb = new StringBuffer();
        Iterator<String> it = status.iterator();
        while(it.hasNext()){
            sb.append(it.next());
            sb.append("\n");
        }
        return sb.toString();
    }
}
