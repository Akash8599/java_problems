package syncrhonization;

 class Counter {
    private int counter =0;

    public synchronized void icreament(){
        counter++;
    }


    public int getCount (){
        return counter;
    }

}

public class CounterTest{
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i<10; i++){
                counter.icreament();
            }
        });

        Thread thread2 = new Thread(() ->{
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i<10; i++){
                counter.icreament();
            }
        });

        thread1.start();
        thread2.start();


        // Output the final count (should be 2000 if thread-safe)
System.out.println("Final count: " + counter.getCount());

        try
        {
            thread1.join();
//            thread2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        // Output the final count (should be 2000 if thread-safe)
        System.out.println("Final count: " + counter.getCount());


    }
}


