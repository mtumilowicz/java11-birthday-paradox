import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
public class BirthdaySimulatorTest {
    
    @Test
    public void lessThan0() {
        assertEquals(0, BirthdaySimulator.birthdays(-1).count());
    }

    @Test
    public void howMany_0() {
        assertEquals(0, BirthdaySimulator.birthdays(0).count());
    }

    @Test
    public void howMany_5() {
        assertEquals(5, BirthdaySimulator.birthdays(5).count());
    }

    @Test
    public void howMany_100() {
        assertEquals(100, BirthdaySimulator.birthdays(100).count());
    }
}