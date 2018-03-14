package verifica;

import java.util.Random;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Posti {

    private static Posti pos;
    private static Thread p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
    private static final Random rand = new Random();
    private static Semaphore sm = new Semaphore(10);
    int tempo=60000;

    private void postoOccupato() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printAtackTrace();
        }
    }

    void occupaPosto() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " è stato occupato");
        Thread.sleep(rand.nextInt(1000)+1000);
        System.out.println(Thread.currentThread().getName() + " è ora libero");
    }

    void statoThread() {
        System.out.println("\n" + Thread.currentThread().getName());
    }

    private class Persona implements Runnable {

        Posti pos;

        Persona (String name, Posti pos) {
            super();
            this.pos = pos;
        }

        @Override
        public void run() {
            while (true) {
                postoOccupato();
                sm.acquire();
                Thread.sleep(rand.nextInt(1000);
                sm.release();
            }
        }
    }

    private class Bus implements Runnable {

        Thread ts;

        Bus(String name, ThreadSync ts) {
            super();
            this.ts = ts;
        }

        @Override
        public void run() {
            while (true) {
                postoOccupato();
    		ts.statoThread();
            } 
        }
    }

    public void startThreads() {
        ThreadSync ts = new ThreadSync();
        p1 = new Thread(new Persona("Writer # 1", ts));
        p2 = new Thread(new Bus("Reader # 1", ts));
        p1.start();
        p2.start();

    }

    public static void main(String[] args) {
        thrdsync = new ThreadSync();
        thrdsync.startThreads();
    }
}
