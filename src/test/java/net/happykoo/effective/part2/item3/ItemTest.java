package net.happykoo.effective.part2.item3;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getDeclaredConstructor();

        constructor.setAccessible(true);

        Person p = Person.getInstance();

        Person p1 = constructor.newInstance();
        Person p2 = constructor.newInstance();

        assertEquals(p1, p2);
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
            out.writeObject(Person.getInstance());
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
                Person newInstance = (Person) in.readObject();

                assertEquals(Person.getInstance(), newInstance);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
