package org.example.mutex;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.example.SequenceGeneratorUtils.getUniqueSequences;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceGeneratorUsingReentrantLockTest {
    private static final SequenceGeneratorUsingReentrantLock generator = new SequenceGeneratorUsingReentrantLock();

    @Test
    public void givenUnsafeSequenceGenerator_whenRaceCondition_thenUnexpectedBehavior() throws Exception {
        int count = 1000;
        Set<Integer> uniqueSequences = getUniqueSequences(generator, count);
        assertEquals(count, uniqueSequences.size());
    }


}
