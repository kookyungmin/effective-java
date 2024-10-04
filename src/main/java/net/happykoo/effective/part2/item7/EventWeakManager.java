package net.happykoo.effective.part2.item7;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EventWeakManager extends EventManager {
    private List<WeakReference<EventListener>> listeners = new ArrayList<>();

    @Override
    public void addListener(EventListener listener) {
        this.listeners.add(new WeakReference<>(listener));
    }

    @Override
    public void notifyEvent(String event) {
        Iterator<WeakReference<EventListener>> iterator = listeners.listIterator();
        while (iterator.hasNext()) {
            EventListener listener = iterator.next().get();

            if (Objects.isNull(listener)) {
                iterator.remove();
            } else {
                listener.onEvent(event);
            }
        }
    }
}