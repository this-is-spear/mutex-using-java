package org.example.semaphore;

import org.example.SequenceGenerator;

import java.util.concurrent.Semaphore;

public class SequenceGeneratorUsingSemaphore extends SequenceGenerator {

    private Semaphore mutex = new Semaphore(1);

    @Override
    public int getNextSequence() {
        try {
            mutex.acquire();
            return super.getNextSequence();
        } catch (InterruptedException e) {
            // exception handling code
            throw new RuntimeException();
        } finally {
            mutex.release();
        }
    }
}

