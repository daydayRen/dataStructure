package com.yitian.sort;


/**
 * @author ：yitianRen
 * @date ：Created in 2019-1-28 13:54
 * @description： 插入排序是比较第n个数可以插入到哪个位置
 * @modified By：
 * @version: $
 */
public class InsertionSort {

    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }


    //按顺序打印数组中的元素
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public void insertionSort() {

        int len = array.length;
        int temp ;
        int insertPoint;

        for (int i = 1; i <= len - 1; i++) {
            temp = array[i];
            insertPoint = i - 1;

            while (insertPoint >=0 && array[insertPoint] > temp) {
                array[insertPoint + 1] = array[insertPoint];//当前位置后移
                insertPoint--;//方便下一次比较  每次后退前一位
            }

            array[insertPoint+1] = temp;//插入标记位置

            System.out.println("第" + i + "次排序结果");
            display();
        }

    }

}
