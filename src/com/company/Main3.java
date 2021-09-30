package com.company;

import java.util.Comparator;

interface MyComparator<T extends Comparable<T>> {
    boolean needSwap(T a, T b);
}

class FromSmallToBigComparator<T extends Comparable<T>> implements MyComparator<T> {

    @Override
    public boolean needSwap(T a, T b) {
        return b.compareTo(a) < 0;
    }
}

class FromBigToSmallComparator<T extends Comparable<T>> implements MyComparator<T> {

    @Override
    public boolean needSwap(T a, T b) {
        return b.compareTo(a) > 0;
    }
}


public class Main3 {

    static <T extends Comparable<T>> void sort(T[] array, MyComparator<T> comparator) {
        boolean isSort;
        T temp;
        do {
            isSort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.needSwap(array[i], array[i + 1]) == true) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSort = false;
                }
            }

        } while (isSort == false);
    }

    public static void main(String[] args) {
        Character[] array = new Character[]{'a', 'e','c', 'f'};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sort(array, new FromBigToSmallComparator());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
