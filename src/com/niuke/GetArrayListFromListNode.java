package com.niuke;

import java.util.ArrayList;

/**
 * @Author: yitianRen
 * @Date: 16:26 2020/3/26
 * @Description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @Version v1.0
 */
public class GetArrayListFromListNode {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        reversal(arrayList,listNode);
        return arrayList;
    }

    private static void reversal(ArrayList<Integer> arrayList, ListNode listNode) {
        if(listNode!=null){
            reversal(arrayList,listNode.next);
            arrayList.add(listNode.val);
        }
    }

    public static void main(String[] args) {
        System.out.println(printListFromTailToHead(new ListNode(1234458)));
    }

}


 class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

