import org.apache.commons.lang3.ObjectUtils;

import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
final class StreamDistinctElementsChecker {
    static boolean check(IntStream ints) {
        return ObjectUtils.defaultIfNull(ints, IntStream.empty())
                .allMatch(new HashSet<>()::add);
    }
}
