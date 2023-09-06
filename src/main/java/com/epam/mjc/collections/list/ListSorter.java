package com.epam.mjc.collections.list;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.pow;


//Implement the program which gets the List and sorts it in ascending order of function 5x^2+3, where x is element from List.
// If the function value is the same for multiple elements, those elements are sorted in ascending order.
//
//List consists of int numbers represented as a String. Use a Comparator for sorting.
public class ListSorter {
    public void sort(List<String> sourceList) {

        List<String> resultsOfFunction = solveFunction(sourceList);

        resultsOfFunction.sort(new ListComparator());
    }

    public List<String> solveFunction(List<String> sourceList) {

        List<String> result = new LinkedList<>();
        for (int i = 0; i <= sourceList.size() - 1; i++) {
            //int e = (int) abs((5 * pow(Integer.valueOf(sourceList.get(i)), 2) + 3));
            int e = (int) (5 * pow((Integer.parseInt(sourceList.get(i))), 2) + 3);
            result.add(String.valueOf(e));
        }

        return result;
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
        //System.out.println();
    }

}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        return Integer.valueOf(a).compareTo(Integer.valueOf(b));
    }


}

//Input
//["-5", "-12", "0", "20", "9", "-20", "37"]

//Output
//["0", "-5", "9", "-12", "-20", "20", "37"]
