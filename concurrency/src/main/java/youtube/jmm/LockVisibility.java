package youtube.jmm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockVisibility {
    private int a = 0, b = 0, c = 0, x =0;
    private Lock lock = new ReentrantLock();

    public void writeThread(){
        lock.lock();
        a = 1;
        b = 1;
        c = 1;
        x = 1; // write of X
        lock.unlock();
    }
    public void readThread(){
        lock.lock();
        int r2 = x; // read of x
        int a1 = a;
        int b1 = b;
        int c1 = c;
        lock.unlock();
    }
}
