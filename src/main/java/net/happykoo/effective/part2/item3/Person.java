package net.happykoo.effective.part2.item3;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Person INSTANCE = new Person();
    private Person() {
        if (Objects.nonNull(INSTANCE)) throw new RuntimeException(new IllegalAccessException());

    }

    public static Person getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
