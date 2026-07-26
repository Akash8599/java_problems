package syncrhonization;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> fetchData("Aksah"));
        CompletableFuture<String> task2 =  CompletableFuture.supplyAsync(() -> fetchData("Tejas"));

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2);

        allTasks.get();

        System.out.println("Task 1 result: " + task1.get());
        System.out.println("Task 2 result: " + task2.get());

        Thread t=   new Thread(() -> System.out.println("Thread name: " + Thread.currentThread().getName()));
        t.start();
    }

    private static String fetchData(String aksah) {
        try
        {
            Thread.sleep(1000);
            System.out.println("Thread name: " + Thread.currentThread().getName());

        }
        catch (Exception e){

        }

        return "Data from " + aksah;
    }
}
