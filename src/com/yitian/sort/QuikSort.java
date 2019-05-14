package com.yitian.sort;

import com.yitian.common.Display;

/**
 * @author ：yitianRen
 * @date ：Created in 2019-5-13 17:05
 * @description：
 * （1）选择一个基准元素，通常选择第一个元素或者最后一个元素；
 *
 * （2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。另一部分记录的元素值比基准值大；
 *
 * （3）此时基准元素在其排好序后的正确位置；
 *
 * （4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
 * @modified By：
 * @version: $
 */
public class QuikSort {

    private int[] array;

    public QuikSort(int[] array) {
        this.array = array;
    }

    public void quikSort(){
        recursiveQuikSort(0,array.length-1);
    }


    /**
     * 递归的快速排序
     *@param low  数组的最小下标
     *@param high  数组的最大下标
     */
    private void recursiveQuikSort(int low,int high){
        if(low>=high){
            return;
        }else{
            int pivot = array[low];  //以第一个元素为基准
            int partition =partitio(low,high,pivot);  //对数组进行划分，比pivot小的元素在低位段，比pivot大的元素在高位段
            Display.Display(array);

            recursiveQuikSort(low,partition-1);  //对划分后的低位段进行快速排序
            recursiveQuikSort(partition+1,high);  //对划分后的高位段进行快速排序
        }
    }




    /**
     *
     * @param low 低位
     * @param high 高位
     * @param criterion 基准数据
     * @return
     */
    public int partitio(int low,int high,int criterion){

        while (low<high){
            //从左边开始扫描  找到比开始值小的值进行交换
            while (low<high&&array[high]>=criterion){
                high--;
            }

            if(low!=high){
                swap(low,high);
            }

            //从右边开始扫描  找到比开始值大的值进行交换
            while (low<high&&array[low]<=criterion){
                low++;
            }
            if(low!=high) {
                swap(low, high);
            }


        }

        return low;

    }

    /**
     * 交换数组中高低位置的数值位置
     * @param low
     * @param high
     */
    public void swap(int low,int high){
        int temp=array[low];
        array[low]=array[high];
        array[high]=temp;
    }

}
