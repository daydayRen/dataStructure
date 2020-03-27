package com.dataStructure.tree;

/**
 * @Author: yitianRen
 * @Date: 16:08 2020/3/27
 * @Description: 树节点的封装类
 * @Version v1.0
 */
public class Node {
    int age;
    String name;
    Node leftChild;  //左子节点的引用
    Node rightChild; //右子节点的引用

    public Node(int age,String name){
        this.age = age;
        this.name = name;
    }

    //打印该节点的信息
    public void displayNode(){
        System.out.println("name:"+name+",age:"+age);
    }
}