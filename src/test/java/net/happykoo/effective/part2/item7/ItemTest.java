package net.happykoo.effective.part2.item7;

import org.junit.jupiter.api.Test;


public class ItemTest {
    @Test
    public void test() {
        Stack<Integer> stack = new Stack<>();

        stack.push(123);
        System.out.println(stack.pop());
    }

    @Test
    public void test2() {
        LRUCache<String, String> cache = new LRUCache<>(3);

        cache.put("1", "HAPPY");
        cache.put("2", "KOO");
        cache.put("3", "TEST");
        cache.put("4", "AAA");

        cache.forEach((key, value) -> System.out.println("key : " + key + ", value : " + value));
    }

    @Test
    public void test3() throws InterruptedException {
        EventManager eventManager = new EventManager();
        MainActivity mainActivity = new MainActivity(eventManager);

        eventManager.notifyEvent("Test Event");

        mainActivity = null;

        System.gc();

        Thread.sleep(3000);

        eventManager.notifyEvent("Test Event 2");
    }

    @Test
    public void test4() throws InterruptedException {
        EventWeakManager eventManager = new EventWeakManager();
        MainActivity mainActivity = new MainActivity(eventManager);

        eventManager.notifyEvent("Test Event");

        mainActivity = null;

        System.gc();

        Thread.sleep(300);


        eventManager.notifyEvent("Test Event 2");
    }

}
