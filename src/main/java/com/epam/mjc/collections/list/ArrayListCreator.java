package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= sourceList.size()-1; i++) {
            if ((i+1) % 3 == 0) {
                result.add(sourceList.get(i));
                result.add(sourceList.get(i));
            }
        }

        return result;
    }


    public static void main(String[] args) {

        List<String> sourceList = new ArrayList<>();
        sourceList.add("The");
        sourceList.add("ArrayList");
        sourceList.add("class");
        sourceList.add("has");
        sourceList.add("many");
        sourceList.add("useful");
        sourceList.add("methods");

       // List<String> sourceList = Arrays.asList("I", "love", "you");

        ArrayListCreator ar = new ArrayListCreator();
        ar.createArrayList(sourceList);
        System.out.println(ar.createArrayList(sourceList));

        //Input
        //[The, ArrayList, class, has, many, useful, methods]

        //Output
        //[class, class, useful, useful]

    }
}
