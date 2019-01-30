package com.yitian.sort;

/**
 * @author yitianRen
 * @date 2019-01-28
 * @description   选择排序是选择数组的最大值和最小值
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
