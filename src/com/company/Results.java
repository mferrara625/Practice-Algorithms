package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Results {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {

        List<Integer> columnTotals = new ArrayList<>();
        List<Integer> rowTotals = new ArrayList<>();
        int columnCount = 0;
        int rowCount = 0;
        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.get(i).size(); j++) {
                columnCount += container.get(j).get(i);
//                System.out.println(container.get(j).get(i));
            }
            for(int k = 0; k < container.get(i).size(); k++){
                rowCount += container.get(i).get(k);
            }
//            System.out.println("columnCount: " + columnCount);
//            System.out.println("rowCount: " + rowCount);

            columnTotals.add(columnCount);
            rowTotals.add(rowCount);
            columnCount = 0;
            rowCount = 0;

        }

        Collections.sort(columnTotals);
        Collections.sort(rowTotals);

//        System.out.println(columnTotals);
//        System.out.println(rowTotals);


       if(columnTotals.equals(rowTotals))
           return "Possible";

       return "Impossible";

    }

//    public static String isBalanced(String s) {
//        // Write your code here
//
//
//        Stack<Character> st = new Stack<>();
//        st.push(s.charAt(0));
//        switch(s.charAt(0)){
//            case '}', ']', ')' : return "No";
//        }
//        for (int i = 1; i < s.length(); i++){
//            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
//                st.push(s.charAt(i));
//            System.out.println(st.lastElement());
//            if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') {
//                if (s.charAt(i) == ']' && st.elementAt(st.size() - 2) != '[' || s.charAt(i) == '}' && st.elementAt(st.size() - 2) != '{' || s.charAt(i) == ')' && st.elementAt(st.size() - 2) != '(') {
//                    return "No";
//                } else {
//                    if(!st.empty())
//                        st.pop();
//                    if(!st.empty())
//                        st.pop();
//                }
//            }
//
//        }
//        if(!st.empty())
//            return "NO";
//
//        return "Yes";
//    }
}
