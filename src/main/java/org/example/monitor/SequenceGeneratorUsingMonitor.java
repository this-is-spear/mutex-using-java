package org.example.monitor;

import com.google.common.util.concurrent.Monitor;
import org.example.SequenceGenerator;

public class SequenceGeneratorUsingMonitor extends SequenceGenerator {

    private Monitor mutex = new Monitor();

    @Override
    public int getNextSequence() {
        mutex.enter();
        try {
            return super.getNextSequence();
        } finally {
            mutex.leave();
        }
    }

}
