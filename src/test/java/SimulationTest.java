import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
public class SimulationTest {

    @Test
    public void probabilityOf22() {
        var n = 100_000;
        var persons = 22;
        var haveSameBirthday = 0d;

        for (int i = 0; i < n; i++) {
            if (!StreamDistinctElementsChecker.check(BirthdaySimulator.birthdays(persons))) {
                haveSameBirthday++;
            }
        }

        var probability = haveSameBirthday / n;

        assertThat(probability, lessThan(0.5));
    }
    
    @Test
    public void probabilityOf23() {
        var n = 100_000;
        var persons = 23;
        var haveSameBirthday = 0d;
        
        for (int i = 0; i < n; i++) {
            if (!StreamDistinctElementsChecker.check(BirthdaySimulator.birthdays(persons))) {
                haveSameBirthday++;
            }
        }
        
        var probability = haveSameBirthday / n;
        
        assertThat(probability, greaterThan(0.5));
    }

    @Test
    public void probabilityOf70() {
        var n = 100_000;
        var persons = 70;
        var haveSameBirthday = 0d;

        for (int i = 0; i < n; i++) {
            if (!StreamDistinctElementsChecker.check(BirthdaySimulator.birthdays(persons))) {
                haveSameBirthday++;
            }
        }

        var probability = haveSameBirthday / n;

        assertThat(probability, greaterThan(0.99));
    }
}
