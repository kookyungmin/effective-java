package net.happykoo.effective.part2.item8;

import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void test() throws InterruptedException {
        Resource resource = new Resource();
        resource = null;
        System.gc();

        Thread.sleep(1000);
    }
}
