package com.dataStructure.tree;

/**
 * @Author: yitianRen
 * @Date: 16:15 2020/3/27
 * @Description:
 * @Version v1.0
 */
public class testTree {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
       /* for (int i = 0; i < 5; i++) {
            binaryTree.insert(new Node(i+1,"节点："+i));
        }*/
       //5 15 20 25 30 35 40
        binaryTree.insert(new Node(2,"节点："+2));
        binaryTree.insert(new Node(15,"节点："+15));
        binaryTree.insert(new Node(10,"节点："+10));
        binaryTree.insert(new Node(3,"节点："+3));
        binaryTree.insert(new Node(7,"节点："+7));
        binaryTree.displayTree();
        System.out.println("------------------------------------");
        binaryTree.traverse(1);
        binaryTree.traverse(2);
        binaryTree.traverse(3);
    }
}
