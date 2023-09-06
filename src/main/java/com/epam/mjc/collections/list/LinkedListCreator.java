package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {

    //Implement the program which will create LinkedList<Integer> from List<Integer> following the rule:
    //
    //If the number from the List<Integer> is odd, then insert this number at the beginning of the LinkedList<Integer>,
    // otherwise, insert the number at the end of the LinkedList<Integer>.
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i <= sourceList.size() - 1; i++) {
            if (sourceList.get(i) % 2 != 0) {
                result.addFirst(sourceList.get(i));
            } else {
                result.addLast(sourceList.get(i));
            }
        }

        //Input
        //[2, 14, 3, 6, 5, 7]

        //Output
        //[7, 5, 3, 2, 14, 6]

        return result;
    }


    public static void main(String[] args) {

        List<Integer> sourceList = new ArrayList<>();

        sourceList.add(2);
        sourceList.add(14);
        sourceList.add(3);
        sourceList.add(6);
        sourceList.add(5);
        sourceList.add(7);

        LinkedListCreator ll = new LinkedListCreator();
        ll.createLinkedList(sourceList);

        //Input
        //[2, 14, 3, 6, 5, 7]

        //Output
        //[7, 5, 3, 2, 14, 6]

    }
}
