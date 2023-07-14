package com.dsa.threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{

    BlockingQueue<Integer> buffer;
    private int maxItems;

    public Producer(BlockingQueue<Integer> buffer, int maxItems){
       this.buffer = buffer;
       this.maxItems = maxItems;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<maxItems;i++){
                System.out.println("Producer producing item: " + i);
                buffer.put(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException interruptedException){
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer implements  Runnable{
    BlockingQueue<Integer> buffer;

    public Consumer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true){
                int i = buffer.take();
                System.out.println("Consumer consuming item: " + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
public class ProducerConsumerExample {
    public static void main(String[] args) {

        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);
        int maxItems = 10;
        Producer producer = new Producer(buffer, maxItems);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}
