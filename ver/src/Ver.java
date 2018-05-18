import static java.lang.Thread.State.WAITING;
import java.util.concurrent.Semaphore;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class bus {

    static Semaphore postiBus = new Semaphore(10);

    static class StatoPosti implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " è occupato");
            Gestioneposti();
            System.out.println("Thread " + Thread.currentThread().getName() + " è uscito dal bus");

        }

        private void Gestioneposti() {
                Random rand = new Random();
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
            }
        }

    }
    
    private static void RicercaPosti() {
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
        }
    }
    
    static class Write implements Runnable {

        @Override
        public void run() {
            try {
                RicercaPosti();
                postiBus.acquire();
                System.out.println("Thread " + Thread.currentThread().getName() + " è salito sul bus");
                
                postiBus.release();
                System.out.println("Thread " + Thread.currentThread().getName() + " è sceso dal bus");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        StatoPosti read = new StatoPosti();
        Write write = new Write();
        Thread p1 = new Thread(write);
        p1.setName("persona1");
        Thread p2 = new Thread(write);
        p2.setName("persona2");
        Thread p3 = new Thread(write);
        p3.setName("persona3");
        Thread p4 = new Thread(write);
        p4.setName("persona4");
        Thread p5 = new Thread(write);
        p5.setName("persona5");
        Thread p6 = new Thread(write);
        p6.setName("persona6");
        Thread p7 = new Thread(write);
        p7.setName("persona7");
        Thread p8 = new Thread(write);
        p8.setName("persona8");
        Thread p9 = new Thread(write);
        p9.setName("persona9");
        Thread p10 = new Thread(write);
        p10.setName("persona10");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
        Thread controllore = new Thread(read);
        controllore.start();
        if(controllore.getState()!=WAITING){
            p1.interrupt();
            p2.interrupt();
            p3.interrupt();
            p4.interrupt();
            p5.interrupt();
            p6.interrupt();
            p7.interrupt();
            p8.interrupt();
            p9.interrupt();
            p10.interrupt();
        }
    }
}