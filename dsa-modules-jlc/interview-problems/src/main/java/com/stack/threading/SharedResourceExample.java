package com.stack.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceExample {
    private static int x = 0;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        // Create five threads and start them
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Worker());
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final value of 'x'
        System.out.println("Final value of x: " + x);
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000000; i++) {
                // Acquire the lock to access the shared resource 'x'
                lock.lock();
                try {
                    // Common code executed by all threads
                    x = x + 1;
                } finally {
                    // Release the lock after accessing the shared resource
                    lock.unlock();
                }
            }
        }
    }
}
