package org.example.memen;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList;

    public void add(Memento memento) {
        if (mementoList == null) {
            mementoList = new ArrayList<>();
        }
        mementoList.add(memento);
    }

    public Memento get(int i) {
        return mementoList.get(i);
    }
}