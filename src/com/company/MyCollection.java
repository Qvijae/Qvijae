package com.company;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyCollection<T> implements Iterator<T>, Iterable<T> {
    private T[] array;
    private Class<T> classType;

    private int currentIndex;

    public MyCollection(Class<T> classType) {
        this.classType = classType;
        array = (T[]) Array.newInstance(classType, 0);
    }

    public int getSize() {
        return array.length;
    }

    public T getElement(int index) {
        return array[index];
    }

    public void addToEnd(T element) {
        T[] tempArray = (T[]) Array.newInstance(classType, array.length + 1);

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        tempArray[tempArray.length - 1] = element;

        array = tempArray;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length - 1;
    }

    @Override
    public T next() {
        currentIndex++;
        return array[currentIndex];
    }

    @Override
    public Iterator<T> iterator() {
        currentIndex = -1;
        return this;
    }
}
