package net.happykoo.effective.part2.item2;

import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void test() {
        Developer developer = new Developer.builder()
                .name("happykoo")
                .level(Developer.Level.INTERMEDIATE)
                .build();
    }
}
