package com.yitian.test;

import com.yitian.sort.SelectionSort;

public class SelectTest {
    public static void main(String[] args) {
        int[] array={1,3,9,2,5,8,7};
        SelectionSort selectionSort=new SelectionSort(array);
        selectionSort.display();
        selectionSort.selectSort();
    }
}
