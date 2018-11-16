import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
public class StreamDistinctCheckerTest {

    @Test
    public void nullStream() {
        assertTrue(StreamDistinctChecker.check(null));
    }

    @Test
    public void emptyStream() {
        assertTrue(StreamDistinctChecker.check(IntStream.empty()));
    }

    @Test
    public void oneElemStream() {
        assertTrue(StreamDistinctChecker.check(IntStream.of(1)));
    }

    @Test
    public void twoSameElemStream() {
        assertFalse(StreamDistinctChecker.check(IntStream.of(1, 1)));
    }

    @Test
    public void twoDiffElemStream() {
        assertTrue(StreamDistinctChecker.check(IntStream.of(1, 2)));
    }

    @Test
    public void complexDiffElemStream() {
        assertTrue(StreamDistinctChecker.check(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8)));
    }

    @Test
    public void complexWithTwoSameElemStream() {
        assertFalse(StreamDistinctChecker.check(IntStream.of(1, 2, 3, 4, 5, 5, 7, 8)));
    }
}