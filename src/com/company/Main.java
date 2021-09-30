package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    MyCollection<Character> myCollection = new MyCollection(Character.class);

	    myCollection.addToEnd('a');
	    myCollection.addToEnd('c');
	    myCollection.addToEnd('d');

//        for (int i = 0; i < myCollection.getSize(); i++) {
//            System.out.println(myCollection.getElement(i));
//        }

        for (Character item: myCollection) {
            System.out.println(item);
        }

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('c');
        characters.add('d');

//        for (int i = 0; i < characters.size(); i++) {
//            System.out.println(characters.get(i));
//        }
//
//        for (char item: characters) {
//            System.out.println(item);
//        }

    }
}
