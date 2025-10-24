package com.demo.test;

import com.demo.beans.ArrayData;
import com.demo.services.ArrayMerger;

public class MergeArraysDemo {

    public static void main(String[] args) {

        // Input two sorted arrays
        int[] nums1 = ArrayData.inputArray("Array 1");
        int[] nums2 = ArrayData.inputArray("Array 2");

        // Merge arrays
        int[] merged = ArrayMerger.mergeSortedArrays(nums1, nums2);

        // Print merged array
        System.out.println("Merged array in sorted order:");
        ArrayMerger.printArray(merged);
    }
}
