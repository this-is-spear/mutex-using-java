package org.example.synchronize;

import org.example.SequenceGenerator;

public class SequenceGeneratorUsingSynchronizedMethod extends SequenceGenerator {
    @Override
    public synchronized int getNextSequence() {
        return super.getNextSequence();
    }
}
