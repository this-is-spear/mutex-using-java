package org.example.mutex;

import org.example.SequenceGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.example.SequenceGeneratorUtils.getUniqueSequences;
import static org.junit.jupiter.api.Assertions.*;

class SequenceGeneratorUsingReentrantLockTest {
    private static final SequenceGeneratorUsingReentrantLock generator = new SequenceGeneratorUsingReentrantLock();

    @Test
    public void givenUnsafeSequenceGenerator_whenRaceCondition_thenUnexpectedBehavior() throws Exception {
        int count = 1000;
        Set<Integer> uniqueSequences = getUniqueSequences(generator, count);
        assertEquals(count, uniqueSequences.size());
    }


}
