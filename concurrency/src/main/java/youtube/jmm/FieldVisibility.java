package youtube.jmm;

public class FieldVisibility {
    private int x =0;
    public void writeThread(){
        x=1;
    }
    public void readThread(){
        int r2 = x;
    }
}
