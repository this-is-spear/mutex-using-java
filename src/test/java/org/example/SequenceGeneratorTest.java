package org.example;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.example.SequenceGeneratorUtils.getUniqueSequences;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceGeneratorTest {
    @Test
    public void givenUnsafeSequenceGenerator_whenRaceCondition_thenUnexpectedBehavior() throws Exception {
        int count = 1000;
        Set<Integer> uniqueSequences = getUniqueSequences(new SequenceGenerator(), count);
        assertEquals(count, uniqueSequences.size());
    }
}
