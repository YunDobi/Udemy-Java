package second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (nums1.length < 1) {
//            System.out.println(nums2);
//        } else if(nums2.length < 0) {
//            System.out.println(nums1);
//        }
//
//        List<Integer> temp = new ArrayList<>();
//
//        for(int i = 0; i < n; i++) {
//
//            temp.add(nums1[i]);
//            temp.add(nums2[i]);
//        }
//        System.out.println(Collections.sort(temp));
//    }
//}

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1997";
        int startingIndex = birthDate.indexOf("1997");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println(newDate);

        newDate = "25";
        newDate = newDate.concat("/11");
        newDate = newDate.concat("/1197");
        System.out.println(newDate);
        newDate = newDate.replace("/", "-");
        System.out.println(newDate);


    }
}