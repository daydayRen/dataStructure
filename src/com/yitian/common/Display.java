package com.yitian.common;

/**
 * @author ：yitianren
 * @date ：Created in 2019-5-6 9:40
 * @description：打印
 * @modified By：
 * @version: $
 */
public class Display {

    //private static int[] array;

    public static void  Display(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }


}
