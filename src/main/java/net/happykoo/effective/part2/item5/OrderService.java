package net.happykoo.effective.part2.item5;

import java.util.function.Supplier;

public class OrderService {
    private final Supplier<? extends PaymentProcessor> paymentProcessorFactory;

    public OrderService(Supplier<? extends PaymentProcessor> paymentProcessorFactory) {
        this.paymentProcessorFactory = paymentProcessorFactory;
    }

    public void processOrder(double money) {
        paymentProcessorFactory.get().pay(money);
    }
}
