package net.happykoo.effective.part2.item3;

import net.happykoo.effective.part2.item2.Developer.Level;

public enum Developer {
    INSTANCE(Level.INTERMEDIATE);
    private final Level level;

    Developer(Level level) {
        this.level = level;
    }
}
