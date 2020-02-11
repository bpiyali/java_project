package books.concurrentProgramming.chapter1.usingConcurrencyConstructs;

import java.awt.*;
import java.util.Random;

public class Particle {
    private int x;
    private int y;
    private final Random range = new Random();

    public Particle(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public synchronized void move(){
        x += range.nextInt(10) - 5;
        y += range.nextInt(20) -10;
    }

    public void draw(Graphics g){
        int lx, ly;
        synchronized (this){
            lx = this.x;
            ly = this.y;
        }
        g.drawRect(lx, ly, 10, 20);
    }
}
