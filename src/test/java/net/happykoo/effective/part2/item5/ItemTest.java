package net.happykoo.effective.part2.item5;

import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void test() {
        OrderService orderService = new OrderService(() -> new CreditCardProcessor());
        orderService.processOrder(1500);
    }
}