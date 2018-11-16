import org.apache.commons.lang3.ObjectUtils;

import java.util.HashSet;
import java.util.stream.IntStream;

import static java.util.Objects.isNull;

/**
 * Created by mtumilowicz on 2018-11-16.
 */
final class StreamDistinctChecker {
    boolean check(IntStream ints) {
        if (isNull(ints)) {
            return true;
        }
        return ObjectUtils.defaultIfNull(ints, IntStream.empty())
                .allMatch(new HashSet<>()::add);
    }
}
