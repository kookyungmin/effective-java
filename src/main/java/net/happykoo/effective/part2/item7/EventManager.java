package net.happykoo.effective.part2.item7;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener listener) {
        this.listeners.add(listener);
    }

    public void notifyEvent(String event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }

    public interface EventListener {
        void onEvent(String event);
    }
}
