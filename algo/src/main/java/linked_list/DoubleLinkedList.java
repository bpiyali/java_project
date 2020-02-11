package algo.linkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList <T>{
    private static class Node<T>{
        Node<T> next = null;
        Node<T> previous = null;
        T value;

        Node(T value){
            this.value = value;
        }
    }

    private Node<T> headNode = null;

    public void add(T value){
        Node<T> newNode = new Node(value);
        if(headNode != null) {
            newNode.next = headNode;
            headNode.previous = newNode;
        }
        headNode = newNode;
    }

    public void delete(T value){
        if(headNode == null)
            throw new NoSuchElementException();

        if(headNode.value.equals(value)) {
            Node<T> node  = headNode;
            headNode = node.next;
            headNode.previous = null;
            node.next = null;
        }else {
            Node<T> previousNode  = headNode;
            Node<T> node  = headNode.next;
            while(node!=null){
                if(node.value.equals(value)) {
                    previousNode.next = node.next;
                    if(node.next !=null)
                        node.next.previous = node.previous;
                    node.next = null;
                    node.previous = null;
                    break;
                }
                previousNode = node;
                node = node.next;
            }
        }
    }
    private void print(){
        Node<T> tail = null;
        for(Node<T> curr = headNode; curr != null; curr = curr.next) {
            System.out.print(curr.value+"  ");
            tail = curr;
        }
        System.out.println("***************");
        for(Node<T> curr = tail; curr != null; curr = curr.previous)
            System.out.print(curr.value+"  ");
    }


    public static void main(String[] args) {
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList();
        for(int i=0; i<10; i++)
            linkedList.add(i);
        //linked_list.print();
        linkedList.delete(0);
        linkedList.print();

    }
}
