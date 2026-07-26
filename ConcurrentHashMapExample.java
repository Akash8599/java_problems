import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");


        Runnable writer = ()  -> {
            for (int i = 4;  i<=6 ; i++ ){
                map.put(i, "Fruit" +i);
                System.out.println(Thread.currentThread().getName() + " added " + i);
            }
        };
        Runnable  reader = () -> {
            for (int i = 1;  i<=6 ; i++ ){

                System.out.println(Thread.currentThread().getName() + " read " + map.get(i));
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();

        try {
            t1.join();  // Ensures writer completes before readers start
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Now start readers
        t2.start();
        t3.start();

        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Final map content
        System.out.println("Final Map: " + map);

    }
}
