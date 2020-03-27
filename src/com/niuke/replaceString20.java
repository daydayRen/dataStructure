package com.niuke;

/**
 * @Author: yitianRen
 * @Date: 16:17 2020/3/26
 * @Description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Version v1.0
 */
public class replaceString20 {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
}
