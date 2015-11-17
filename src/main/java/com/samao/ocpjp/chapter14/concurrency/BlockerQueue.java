package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hsamao on 11/17/15.
 */
public class BlockerQueue {
    private int size = 0;
    private Object elements[];

    private int currPoint = 0;
    private Lock internalLock = new ReentrantLock();
    private Condition empty = internalLock.newCondition();
    private Condition full = internalLock.newCondition();

    public BlockerQueue(int size) {
        this.size = size;
        elements = new Object[size];
    }

    public Object remove() {
        Object element = null;
        internalLock.lock();

        try {
            if (currPoint == 0) {
                System.out.println("In remove(): no element to remove, so waiting for insertion");
                empty.await();
                System.out.println("In remove(): got notification that an element has got inserted");
            }
            element = elements[--currPoint];
            System.out.println("in remove(): removed the element " + element);
            full.signalAll();
            System.out.println("In remove(): signalled that there is space for insertion");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            internalLock.unlock();
        }
        return element;
    }

    public void insert(Object element) {
        internalLock.lock();
        try {
            if (currPoint == size) {
                System.out.println("In insert(): queue is full, so waiting for removal");
                full.await();
                System.out.println("in insert(): got notification that remove got called, so proceeding to insert the element");
            }

            elements[currPoint++] = element;
            System.out.println("In insert(): inserted the element " + element);
            empty.signalAll();
            System.out.println("In insert(): notified that queue is not empty");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            internalLock.unlock();
        }
    }
}
