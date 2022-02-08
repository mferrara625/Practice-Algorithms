package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(Results.isBalanced("{[()]}"));
//        System.out.println(Results.isBalanced("{[(])}"));
//        System.out.println(Results.isBalanced("{{[[(())]]}}"));


        List<List<Integer>> container = new ArrayList<>();
//        List<Integer> c1 = Arrays.asList(1,3,1);
//        List<Integer> c2 = Arrays.asList(2,1,2);
//        List<Integer> c3 = Arrays.asList(3,3,3);

        List<Integer> c1 = Arrays.asList(0,2,1);
        List<Integer> c2 = Arrays.asList(1,1,1);
        List<Integer> c3 = Arrays.asList(2,0,0);

        container.add(c1);
        container.add(c2);
        container.add(c3);

        System.out.println(Results.organizingContainers(container));



    }
}
