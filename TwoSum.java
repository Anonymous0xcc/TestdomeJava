//  Created by Shawn O'Grady on 12/7/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
 
 https://www.testdome.com/questions/java/two-sum/10284?visibility=1&skillId=4
 
 Problem statement: Write a function that, given a list and a target sum, returns zero-based indices of any two distinct elements whose sum is equal to the target sum. If there are no such elements, the function should return null.

 +passes 3/4 tests
 	-code takes too long to answer when array has large # of elements
 */
package TwoSum;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        if (list == null || list.length < 2) return null;
    //map values to indexes
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < list.length; i++) {
        int needed = sum - list[i];
        if (indexMap.get(needed) != null) {
            return new int[]{i, indexMap.get(needed)};
        }

        indexMap.put(list[i], i);
    }

    //none found
    return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 10);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
