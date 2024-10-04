package net.happykoo.effective.part2.item8;

import java.lang.ref.Cleaner;

public class Resource implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    private static class State implements Runnable {
        private boolean isCleanup = false;

        @Override
        public void run() {
            if (isCleanup) return;
            System.out.println("Cleaner clean!");
            isCleanup = true;
        }
    }

    public Resource() {
        this.cleanable = cleaner.register(this, new State());
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
