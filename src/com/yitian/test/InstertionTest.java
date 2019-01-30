package com.yitian.test;

import com.yitian.sort.InsertionSort;

/**
 * @author ：yitianRen
 * @date ：Created in 2019-1-28 14:05
 * @description：
 * @modified By：
 * @version: $
 */
public class InstertionTest {
    public static void main(String[] args) {
        int[] array={3,1,9,2,5,8,7};
        InsertionSort insertionSort=new InsertionSort(array);
        insertionSort.display();
        insertionSort.insertionSort();
    }
}
