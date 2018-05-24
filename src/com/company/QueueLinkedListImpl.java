package com.company;

import java.util.NoSuchElementException;

public class QueueLinkedListImpl {
    private ListNode head;
    private ListNode tail;

    public void enqueue(int val){
        if(isEmpty()){
            head = tail = new ListNode(val);
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = head.val;
        head = head.next;
        return result;
    }

    public int peekhead(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return head.val;
    }

    public boolean isEmpty(){
        return head==null;

    }

    public void clear(){
        head = null;

    }
}
