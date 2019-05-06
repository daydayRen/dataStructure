package com.yitian.common;

/**
 * @author ：yitianren
 * @date ：Created in 2019-5-6 9:40
 * @description：打印
 * @modified By：
 * @version: $
 */
public class Display {

    private int[] array;

    public Display(int[] array) {
        this.array = array;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    /*//按顺序打印数组中的元素
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }*/

}
