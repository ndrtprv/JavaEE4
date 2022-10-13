package org.example.memen;

import org.example.Stats;

public class Memento {
    private Stats state;

    public Memento() {

    }

    public Memento(Stats state) {
        this.state = state;
    }

    public Stats getState() {
        return state;
    }
}