package books.concurrentProgramming.chapter1.usingConcurrencyConstructs;

public class Main {
    public static void main(String[] args) {
        ParticleApplet particleApplet = new ParticleApplet();
        particleApplet.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        particleApplet.stop();
    }
}
