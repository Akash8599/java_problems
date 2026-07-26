package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> faactorial(10));
        executorService.shutdown();



    }




    private static void faactorial(int i){

        int n = 1;
        for (int j = 1; j <= i; j++) {
           n = n*j;
            System.out.println(n);
        }

    }
}
