package com.niuke;

/**
 * @Author: yitianRen
 * @Date: 15:30 2020/3/26
 * @Description:  思路：既然是有序，第一想到的是二分查找法
 * @Version v1.0
 */
public class seachInTwoDimensionalArray {

    public static boolean getData(int [][] array,int target){
        boolean dataFlag=false;
        for (int i = 0; i <array.length ; i++) {
            int  start=0;
            int end=array[i].length-1;
            while (start<=end){
                int mid=(start+end)/2;
                if (target< array[i][mid]){
                    end=mid-1;
                }else if(target> array[i][mid]){
                    start=mid+1;
                }else if(target== array[i][mid]){
                    dataFlag=true;
                    start=end+1;
                }
            }
            if(dataFlag==true){
                break;
            }
        }
        return dataFlag;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {{1,2,3},{4,5,7}};
        System.out.println(getData(a,7));
    }

}
