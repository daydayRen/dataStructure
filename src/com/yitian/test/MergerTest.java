package com.yitian.test;

import com.yitian.sort.BubbleSort;
import com.yitian.sort.MergerSort;

/**
 * @author ：yitianRen
 * @date ：Created in 2019-1-31 11:03
 * @description：归并排序测试
 * @modified By：
 * @version: $
 */
public class MergerTest {
    public static void main(String[] args) {
        int[] array={1,3,9,2,5,8,7};
        MergerSort mergerSort=new MergerSort(array);
        mergerSort.display();
        mergerSort.mergeSort();
    }
}
