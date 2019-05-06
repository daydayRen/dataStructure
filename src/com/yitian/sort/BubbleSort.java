package com.yitian.sort;

/**
 * 冒泡排序
 *
 * 优化链接  ：https://blog.csdn.net/hansionz/article/details/80822494
 *
 * 优化  1  标志判断是否有交换  没有即停止
 *      2   标记排序后的位置   从这个位置继续排序
 *      3  目前感觉这个排序还是有点问题  但是思路很好
 */
public class BubbleSort {

    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }


    //按顺序打印数组中的元素
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    //冒泡排序
    public void bubbleSort() {
        int temp;
        int len = array.length;

        for (int i = 0; i < len - 1; i++) {  //外层循环：每循环一次就确定了一个相对最大元素
            for (int j = 1; j < len - i; j++) {  //内层循环：有i个元素已经排好，根据i确定本次的比较次数
                if (array[j - 1] > array[j]) {  //如果前一位大于后一位，交换位置
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "轮排序结果：");
            display();
        }
    }
}
