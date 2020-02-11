package problem21;

import listNode.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = null;
        ListNode tailNode = null;
        ListNode newNode;
        while(l1 != null || l2 != null){
            if(l1!=null && l2!=null && l1.val <= l2.val){
                newNode = new ListNode(l1.val);
                l1 = l1.next != null? l1.next : null;
            }else{
                newNode = new ListNode(l2.val);
                l2 = l2.next != null? l2.next : null;
            }
            if(tailNode !=null ){
                tailNode.next = newNode;
                tailNode = newNode;
            }else{
                tailNode = newNode;
                headNode = tailNode;
            }
        }
        return headNode;
    }
}
