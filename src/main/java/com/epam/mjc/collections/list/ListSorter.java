package com.epam.mjc.collections.list;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.pow;



public class ListSorter {
    public void sort(List<String> sourceList) {

        sourceList.sort(new ListComparator());
        Collections.reverse(sourceList);
        System.out.println((sourceList));

    }

    public static void main(String[] args) {
        //List<String> sourceList = Arrays.asList("-5", "-12", "0", "20", "9", "-20", "37");
        List<String> sourceList = new ArrayList<>();
        sourceList.add("-5");
        sourceList.add("-12");
        sourceList.add("0");
        sourceList.add("20");
        sourceList.add("9");
        sourceList.add("-20");
        sourceList.add("37");

        ListSorter ls = new ListSorter();
        ls.sort(sourceList);
    }

}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        int calculatedA = calc(intA);
        int calculatedB = calc(intB);

        return Integer.compare(Math.abs(calculatedB), Math.abs(calculatedA));
    }

    private int calc(int x) {
        double form = Math.pow(5 * x, 2) + 3;
        int result = (int) form;
        return result;
    }


    //    @Override
//    public int compare(String a, String b) {
//
//        //return Integer.valueOf(a).compareTo(Integer.valueOf(b));
//        int intA = Integer.parseInt(a);
//        int intB = Integer.parseInt(b);
//        return Integer.compare(Math.abs(intB), Math.abs(intA));
//    }

}

