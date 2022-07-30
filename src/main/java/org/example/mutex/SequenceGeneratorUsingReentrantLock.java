package org.example.mutex;

import org.example.SequenceGenerator;

import java.util.concurrent.locks.ReentrantLock;

public class SequenceGeneratorUsingReentrantLock extends SequenceGenerator {

    private ReentrantLock mutex = new ReentrantLock();

    @Override
    public int getNextSequence() {
        try {
            mutex.lock(); // entry section 입장 영역
            return super.getNextSequence(); // critical section 임계 영역
        } finally {
            mutex.unlock(); // exit section  퇴장 영역
        }
    }
}

