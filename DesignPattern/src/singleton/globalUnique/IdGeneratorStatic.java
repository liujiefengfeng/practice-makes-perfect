package singleton.globalUnique;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorStatic {
    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorStatic() {
    }

    private static class SingletonHolder {
        private static final IdGeneratorStatic instance = new IdGeneratorStatic();
    }

    public static IdGeneratorStatic getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
