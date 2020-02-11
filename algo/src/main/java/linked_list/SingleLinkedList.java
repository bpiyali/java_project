package algo.linkedList;

import java.util.NoSuchElementException;

public class SingleLinkedList <T>  {

    private static class Node<T>{
        Node<T> next = null;
        T value;

        Node(T value){
            this.value = value;
        }
    }

    private Node<T> headNode = null;

    public void add(T value){
        Node<T> newNode = new Node(value);
        if(headNode != null)
            newNode.next = headNode;
        headNode = newNode;
    }

    public void delete(T value){
        if(headNode == null)
            throw new NoSuchElementException();

        if(headNode.value.equals(value)) {
            Node<T> node  = headNode;
            headNode = node.next;
            node.next = null;
        }else {
            Node<T> previous  = headNode;
            Node<T> node  = headNode.next;
            while(node!=null){
                if(node.value.equals(value)) {
                    previous.next = node.next;
                    node.next = null;
                    break;
                }
                    previous = node;
                    node = node.next;
            }
        }
    }
    private void print(){
        for(Node<T> curr = headNode; curr != null; curr = curr.next)
            System.out.println(curr.value);
        System.out.println("*********************");
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList();
        for(int i=0; i<10; i++)
            linkedList.add(i);
        linkedList.print();
        linkedList.delete(3);
        linkedList.print();
    }
}
