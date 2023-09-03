package com.dsa.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) {
        // Create a CompletableFuture that will supply a result asynchronously
        CompletableFuture<String> futureResult = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running computation
            try {
                Thread.sleep(2000); // Pausing the thread for 2 seconds (simulating computation)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Result of computation";
        });

        // Perform other tasks while waiting for the future to complete
        System.out.println("Doing some other tasks...");

        // Get the result from the CompletableFuture (this will block until the result is available)
        try {
            String result = futureResult.get();
            System.out.println("Result received: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
