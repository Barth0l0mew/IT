package Patterns.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

//Observer

public class ChildAndMather {
    public static void main(String[] args) {
        Child child = new Child();
        Mother mother = new Mother();

        child.addPropertyChangeListener(mother);
        child.setAction("playing");

        System.out.println("The child is "+mother.getAction());
    }
}

class Child{
    private String action;

    private PropertyChangeSupport support;

    public Child() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener child) {
        support.addPropertyChangeListener(child);
    }

    public void removePropertyChangeListener(PropertyChangeListener child) {
        support.removePropertyChangeListener(child);
    }

    public void setAction(String value){
        support.firePropertyChange("action",this.action,value);
        this.action = value;
    }
}

class Mother implements PropertyChangeListener {

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private String action;

    @Override
    public void propertyChange(PropertyChangeEvent child) {
        this.setAction((String) child.getNewValue());
    }
}