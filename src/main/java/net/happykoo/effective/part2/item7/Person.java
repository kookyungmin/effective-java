package net.happykoo.effective.part2.item7;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {
    private String name;
    private final PropertyChangeSupport support;

    public Person(String name) {
        this.name = name;
        this.support = new PropertyChangeSupport(this);
    }

    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;
        support.firePropertyChange("name", oldName, newName);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
       support.addPropertyChangeListener(listener);
    }

    public void fireChangeEvent() {
        support.firePropertyChange("name", this.name, this.name);
    }
}
