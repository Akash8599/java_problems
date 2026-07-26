package syncrhonization;

public class SynchronizationTest {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a); // Renamed variable

        t1.start();
        t2.start();

        //multiple object then process wiwll be parallel because each object has its own lock
        //one object and we are using two  thread then it will run sequentially coz one object is there so lock is there

    }
}

class A implements Runnable {
    public synchronized void m1() {
        try {
            System.out.println(Thread.currentThread().getName() + " is executing m1()");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " has finished m1()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        m1(); // Calling the synchronized method
    }
}
