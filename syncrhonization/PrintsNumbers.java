package syncrhonization;

import java.util.Objects;

public class PrintsNumbers implements Runnable{

    private static final int N = 10;
    private static int number = 1;
    private  int threadId;

    private static final Object lock = new Object();

    public  PrintsNumbers(int threadId){
        this.threadId = threadId;
    }



    public static void main(String[] args) {

        Thread t1 = new Thread(new PrintsNumbers(0));
        Thread t2 = new Thread(new PrintsNumbers(1));
        Thread t3= new Thread(new PrintsNumbers(2));

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {

        while(number <=N){
            synchronized (lock){
                while (number%3 !=threadId){
                    try {
                        lock.wait();
//                        System.out.println(Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(number <= N){
                    System.out.println("thread- " +  (threadId+1) + " : " + number);
                    number++;
                    lock.notifyAll();
                }

            }
        }
    }
}
