package net.happykoo.effective.part2.item7;

public class MainActivity {
    private EventManager eventManager;

    public MainActivity(EventManager eventManager) {
        this.eventManager = eventManager;
        this.eventManager.addListener(new EventManager.EventListener() {
            @Override
            public void onEvent(String event) {
                System.out.println("receive event >> " + event);
            }

            @Override
            public void finalize() {
                System.out.println("MainActivity listener is destroyed");
            }
        });
    }

    @Override
    public void finalize() {
        System.out.println("MainActivity is destroyed");
    }
}
