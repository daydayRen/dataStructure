package com.yitian.test;

import com.yitian.sort.QuikSort;
import com.yitian.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array={1,3,9,2,5,8,7};
        QuikSort quikSort=new QuikSort(array);
        quikSort.quikSort();

        ShellSort shellSort=new ShellSort(array);
        shellSort.sort();
    }
}
