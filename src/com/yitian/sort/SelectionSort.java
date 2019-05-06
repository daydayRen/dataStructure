package com.yitian.sort;

/**
 * @author yitianRen
 * @date 2019-01-28
 * @description   选择排序是选择数组的最大值和最小值
 *
 * 基本思想
 * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小
 *              （或者最大）的与第2个位置的数交换，
 *              依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
 */
public class SelectionSort {
    private  int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    //按顺序打印数组中的元素
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public void selectSort(){
        int minPoint;  //存储最小元素的小标
        int len = array.length;
        int temp;//交换数据
        int counter = 1;//输出数据

        for (int i = 0; i <= len-1; i++) {

            //标记最小数据位置
            minPoint=i;
            for (int j = i+1; j <=len-1; j++) {
                if(array[j]<array[minPoint])
                    minPoint=j;
            }
            //最小数据放在最前面

            if(minPoint!=i){
                temp=array[i];
                array[i]=array[minPoint];
                array[minPoint]=temp;
            }

            System.out.println("第"+counter+"次排序：");
            display();
            counter++;

        }

    }
}
