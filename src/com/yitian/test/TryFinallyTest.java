package com.yitian.test;
/**
 * @autor yitianRen
 * @date ${Date}
 **/


public class TryFinallyTest {
    public static void main(String[] args) {
        System.out.println(findResult());
    }


    private static Integer findResult() {
        Integer aa=5;
        try {
            return  aa=6;
        }catch (Exception e){
            return  aa=7;
        }finally {
            return  aa=8;
        }
    }
}
