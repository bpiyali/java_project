package books.concurrentProgramming.chapter1.usingConcurrencyConstructs;

import java.applet.Applet;

public class ParticleApplet extends Applet {
    protected Thread[] threads = null; // null when not running
    private final ParticleCanvas canvas = new ParticleCanvas(100);

    public void init() {
        add(canvas);
    }

    private Thread makeThread(final Particle p){
        Runnable runloop = new Runnable() {
            @Override
            public void run() {
                try{
                    for(;;){// while(true) --> forever loop
                        p.move();
                        canvas.repaint();
                        Thread.sleep(100);
                    }
                }catch (InterruptedException e){
                    return;
                }
            }
        };
        return new Thread(runloop);
    }

    public synchronized void start(){
        int n = 10;
        if (threads == null) { // bypass if already started
            Particle[] particles = new Particle[n];
            for(int i=0; i<n; i++)
                particles[i] = new Particle(50, 50);
            canvas.setParticles(particles);
            threads = new Thread[n];
            for(int i=0; i<n; i++){
                threads[i] = makeThread(particles[i]);
                threads[i].start();
            }
        }
    }

    public synchronized void stop(){
        if(threads != null){
            int len = threads.length;
            for(int i=0; i<len; i++)
                threads[i].interrupt();
            threads = null;
        }
    }
}
