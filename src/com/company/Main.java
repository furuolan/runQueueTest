package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        runQueueTest();
    }

    public static void runQueueTest(){
        QueueLinkedListImpl queue = new QueueLinkedListImpl();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.isEmpty());
    }
}

