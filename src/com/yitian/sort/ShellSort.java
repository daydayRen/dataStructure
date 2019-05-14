package com.yitian.sort;

import com.yitian.common.Display;

/**
 * @author ：yitianRen
 * @date ：Created in 2019-5-14 10:14
 * @description：希尔排序  链接https://blog.csdn.net/u012152619/article/details/47405799
 * @modified By：
 * @version: $
 */
public class ShellSort {
    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int len = array.length;
        int h = 1;
        int counter = 1;
        //初始步长  间隔取公约数
        while (h * 3 + 1 < len) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (int i = 0; i < h; i++) {
                shellInsertSort(i, h);

                h = (h - 1) / 3;//下一次排序位置

                System.out.print("第" + counter + "轮排序结果：");
                Display.Display(array);
                counter++;

            }
        }

    }

    public void shellInsertSort(int beginIndex, int increment) {

        int targetIndex = beginIndex + increment;

        //数组中步长有多个数据，多个数据进行排序
        while (targetIndex < array.length) {
            int temp = array[targetIndex];

            int previousIndex = targetIndex - increment;

            //数组中步长有多个数据，多个数据与目标数据进行比对 判断目标数据最终所在的位置
            while (previousIndex >= 0 && array[previousIndex] > temp) {

                array[previousIndex + increment] = array[previousIndex];

                previousIndex = previousIndex - increment;

            }
            array[previousIndex + increment] = temp;//目标数据插入合适位置（不稳定排序，没有相等数据也会交换位置）

            targetIndex = targetIndex + increment;//下一个目标数据
        }

    }


}
