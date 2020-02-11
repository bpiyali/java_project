package basic_algo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by bandypiy on 2/28/2017.
 */
public class Stack<Item> implements Iterable<Item> {

    private Node<Item> first;
    private int n;

    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    public Stack(){
        this.first = null;
        this.n =0;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public int size(){
        return this.n;
    }

    public void push(Item item){
        Node<Item> oldItem = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldItem;
        this.n++;
    }

    public Item pop(){
        if (isEmpty())
            throw new NoSuchElementException("Stack Underflow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }
    private class ListIterator<Item> implements Iterator<Item>{
        private Node<Item> currItem;

        public ListIterator(Node<Item> firstItem){
            currItem = firstItem;
        }

        @Override
        public boolean hasNext() {
            return currItem != null;
        }

        @Override
        public Item next() {
            if(!hasNext())
                throw new NoSuchElementException();
            Item item= currItem.item;
            currItem = currItem.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Removing Item not allowed");
        }

    }
}
