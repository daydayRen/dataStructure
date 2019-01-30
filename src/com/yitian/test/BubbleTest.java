package com.yitian.test;

import com.yitian.sort.BubbleSort;

public class BubbleTest {
    public static void main(String[] args) {
        int[] array={1,3,9,2,5,8,7};
        BubbleSort bubbleSort=new BubbleSort(array);
        bubbleSort.display();
        bubbleSort.bubbleSort();
    }
}
