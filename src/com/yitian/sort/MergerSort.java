package com.yitian.sort;

/**
 * @author ：yitianRen
 * @date ：Created in 2019-1-31 10:20
 * @description：归并排序
 * @modified By：
 * @version: $
 *
 * 基本思想
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，
 *              每个子序列是有序的。
 *              然后再把有序子序列合并为整体有序序列。
 * 分解：将含有n个元素的待排序列分解为各含n/2个元素的两个子序列。
 * 解决：用归并排序递归地排序两个子序列。
 * 合并：合并两个已排序的子序列，以得到最终结果。
 */
public class MergerSort {

    private int[] array;

    public MergerSort(int[] array) {
        this.array = array;
    }


    //按顺序打印数组中的元素
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    //归并排序
    public void mergeSort(){

        int[] workSpace = new int [array.length]; //用于辅助排序的数组
        recursiveMergeSort(workSpace,0,workSpace.length-1);
    }

    /**
     * 递归的归并排序
     * @param workSpace  辅助排序的数组
     * @param lowerBound 欲归并数组段的最小下标
     * @param upperBound 欲归并数组段的最大下标
     */
    private void recursiveMergeSort(int [] workSpace,int lowerBound,int upperBound){

        if(lowerBound== upperBound){  //该段只有一个元素，不用排序
            return;
        }else{
            int mid = (lowerBound+upperBound)/2;
            recursiveMergeSort(workSpace,lowerBound,mid);    //对低位段归并排序
            recursiveMergeSort(workSpace,mid+1,upperBound);  //对高位段归并排序
            merge(workSpace,lowerBound,mid,upperBound);
            display();
        }
    }

    /**
     * 对数组array中的两段进行合并，lowerBound~mid为低位段，mid+1~upperBound为高位段
     * @param workSpace 辅助归并的数组，容纳归并后的元素
     * @param lowerBound 合并段的起始下标
     * @param mid 合并段的中点下标
     * @param upperBound 合并段的结束下标
     */
    private void merge(int [] workSpace,int lowerBound,int mid,int upperBound){

        int lowBegin = lowerBound;  //低位段的起始下标
        int lowEnd = mid;           //低位段的结束下标
        int highBegin = mid+1;  //高位段的起始下标
        int highEnd = upperBound;  //高位段的结束下标
        int j = 0; //workSpace的下标指针
        int n = upperBound-lowerBound+1;  //归并的元素总数

        //比较两个数组  归并排序开始
        while(lowBegin<=lowEnd && highBegin<=highEnd){
            if(array[lowBegin]<array[highBegin]){//将两者较小的那个放到workSpace中
                workSpace[j++]= array[lowBegin++];
            }else{
                workSpace[j++]= array[highBegin++];
            }
        }

        //结束  如果还有剩余
        while(lowBegin<=lowEnd){
            workSpace[j++]= array[lowBegin++];
        }

        while(highBegin<=highEnd){
            workSpace[j++]= array[highBegin++];
        }

        for(j=0;j<n;j++){  //将归并好的元素复制到array中
            array[lowerBound++]= workSpace[j];
        }

    }
}
