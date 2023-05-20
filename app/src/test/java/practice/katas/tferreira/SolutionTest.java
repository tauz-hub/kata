package practice.katas.tferreira;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example test class.
 */
public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
        assertEquals("drow", Kata.solution("word"));
    }
}
