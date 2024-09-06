package net.happykoo.effective.part2.item6;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

public class ItemTest {
    @Test
    public void test() {
        Instant start = Instant.now();

        for(int i = 0; i < 1000; i++) {
            ValidCheckUtils.isPhoneFormat("010-0000-3333");
            ValidCheckUtils.isPhoneFormat("01a-0000333332423423");
            ValidCheckUtils.isPhoneFormat("015-234120-131");
        }

        Instant end = Instant.now();

        System.out.println("수행시간 >>> " + Duration.between(start, end).toMillis() + "ms");
    }

    @Test
    public void autoBoxingTest() {
        Instant start = Instant.now();

        long sum = 0L;
        for(long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        Instant end = Instant.now();

        System.out.println("수행시간 >>> " + Duration.between(start, end).toMillis() + "ms");
    }
}
