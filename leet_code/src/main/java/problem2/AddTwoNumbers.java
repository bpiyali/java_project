package problem2;

import listNode.ListNode;

public class AddTwoNumbers {
    /*private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }*/
    private ListNode headNode = null;
    private void add(int value){
        ListNode newNode = new ListNode(value);
        if(headNode != null)
            newNode.next = headNode;
        headNode = newNode;
    }
    private void print(){
        for(ListNode curr = headNode; curr != null; curr = curr.next)
            System.out.println(curr.val);
        System.out.println("*********************");
    }
    public static void main(String[] args) {
        AddTwoNumbers linkedList1 = new AddTwoNumbers();
        //9999999991
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(9);
        linkedList1.add(1);
        linkedList1.print();
        //System.out.println(linkedList1.linkListNum(linkedList1.headNode));

        AddTwoNumbers linkedList2 = new AddTwoNumbers();
        linkedList2.add(4);
        linkedList2.add(6);
        linkedList2.add(5);
        linkedList2.print();
        //System.out.println(linkedList2.linkListNum(linkedList1.headNode));
        linkedList1.addTwoNumbers(linkedList1.headNode, linkedList2.headNode);

    }
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        int carrier = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int digit = a + b + carrier;
            ListNode next = new ListNode(digit % 10);
            node.next = next;
            node = next;
            carrier = digit >= 10 ? 1 : 0;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (carrier == 1) node.next = new ListNode(1);
        return head.next;
    }*/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        long l1Num = linkListNum(l1);
        long l2Num = linkListNum(l2);
        long sum = l1Num + l2Num;
        listNode = numToList(sum);
        return listNode;
    }

    private long linkListNum(ListNode listNode){
        String num = "";
        int value;
        for(ListNode curr = listNode; curr != null; curr = curr.next){
            value = curr.val;
            num = value+ num ;
        }
        return Long.valueOf(num);
    }
    private ListNode numToList(long num){
        ListNode listNode = null;
        ListNode tailNode = null;
        while(num != 0) {
            long value = num % 10;
            ListNode newNode = new ListNode((int)value);
            if(listNode == null) {
                listNode = newNode;
                listNode.next = tailNode;
                tailNode = newNode;
            }else{
                tailNode.next = newNode;
                tailNode = newNode;
            }
            num /= 10;
        }
        return listNode;
    }
}
