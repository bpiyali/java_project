package youtube.jmm;

public class VolatileFieldVisibility {

    private int a = 0, b = 0, c = 0;
    private volatile int x =0;
    public void writeThread(){
        a = 1;
        b = 1;
        c = 1;

        x = 1; // write of X
    }
    public void readThread(){
        int r2 = x; // read of x

        int a1 = a;
        int b1 = b;
        int c1 = c;
    }
}
