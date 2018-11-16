import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
final class BirthdaySimulator {
    static IntStream birthdays(int howMany) {
        if (howMany <= 0) {
            return IntStream.empty();
        }

        Random r = new Random();
        return r.ints(howMany, 1, 365);
    }
}
