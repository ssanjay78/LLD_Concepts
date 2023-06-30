package AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    // As this is a wrapper class, so direct assignment, inc, decr of values will not work
    AtomicInteger value = new AtomicInteger(0);
}
