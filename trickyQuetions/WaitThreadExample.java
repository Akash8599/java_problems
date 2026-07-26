package trickyQuetions;

import java.util.Objects;

public class WaitThreadExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock){
                try{
                    System.out.println("Thread waiting..." + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("Thread resumed!" + Thread.currentThread().getName());
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized (lock){
                try{
                    Thread.sleep(2000); // Simulating some work
                    System.out.println("Thread notifying..." + Thread.currentThread().getName());
                    lock.notify();
                    System.out.println("After notifying..." + Thread.currentThread().getName());

                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
