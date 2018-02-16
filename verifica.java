import java.util.concurrent.Semaphore;
import java.util.Random;

class bus {

    static Semaphore postiBus = new Semaphore(10);

    static class StatoPosti implements Runnable {

        private final Random rand = new Random();

        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " è occupato");
            Gestioneposti();
            System.out.println("Thread " + Thread.currentThread().getName() + " è uscito dal bus");

        }

        private void Gestioneposti() {
            try {
                Thread.sleep(rand.nextInt(6)*10000);
            } catch (InterruptedException e) {
            }
        }

    }

    static class Write implements Runnable {

        private final Random rand = new Random();

        @Override
        public void run() {
            try {
                postiBus.acquire();
                System.out.println("Thread " + Thread.currentThread().getName() + " is WRITING");
                OccupatorePosti();
                System.out.println("Thread " + Thread.currentThread().getName() + " has finished WRITING");
                postiBus.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void OccupatorePosti() {
        Random rand = new Random();
        try {
            Thread.sleep(rand.nextInt(5)*10000);
        } catch (InterruptedException e) {
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
	p1.sleep(rand.nextInt(5)*10000);
        p2.start();
	p2.sleep(rand.nextInt(5)*10000);
        p3.start();
	p3.sleep(rand.nextInt(5)*10000);
        p4.start();
	p4.sleep(rand.nextInt(5)*10000);
        p5.start();
	p5.sleep(rand.nextInt(5)*10000);
        p6.start();
	p6.sleep(rand.nextInt(5)*10000);
        p7.start();
	p7.sleep(rand.nextInt(5)*10000);
        p8.start();
	p8.sleep(rand.nextInt(5)*10000);
        p9.start();
	p9.sleep(rand.nextInt(5)*10000);
        p10.start();
	p10.sleep(rand.nextInt(5)*10000);
        Thread controllore = new Thread(read);
        controllore.start();
	controllore.sleep(rand.nextInt(5)*10000);
    }
}