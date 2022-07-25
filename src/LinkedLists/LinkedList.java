package LinkedLists;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    private int size;

    public LinkedList() {
    }

    public int count(Node node){
        int count = 1;
        while(node.next != null){
            node = node.next;
            count++;
        }
        return count;
    }
    public void addLast(int item){
        Node node = new Node(item);

        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item){
        Node node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while(current != null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
//        Node current = first;
//        while(current != null){
//            if (current.value == item){
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        //[10 -> 20 -> 30]
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last = null;
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last = null;
        else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public Node getPrevious(Node node){
        Node current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        Node current = first;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public int getTheKthNodeFromEnd(int k){
        //Interviewers may say we don't know size of list,
        // don't use size field: find another way
        Node firstPointer = first;
        Node secondPointer = first;

        //move second pointer until it is k-1 distance from the start
        for(int i = 0; i < k -1; i++){
            secondPointer = secondPointer.next;
            if (secondPointer == null){
                throw new IllegalArgumentException();
            }
        }
        //move both pointers until second pointer reaches the end,
        //then return firstPointer.value;
        while(secondPointer.next != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return firstPointer.value;
    }

    public void reverse(){
        //10
        Node previous = first;
        //20
        Node current = first.next;
        if(isEmpty())
            throw new NoSuchElementException();
        else if(first == last) return;
        //[10 -> 20 -> 30 -> 40]
        // P    C|P  N|C|P   N|C  ...
        while(current != null){
            //30|40|null
            //temporary reference so that the link to the next node is not lost
            Node next = current.next;
            //10|20|30
            //change the links from the next node to the previous node
            current.next = previous;
            //20|30|40
            //move the iteration one step forward
            previous = current;
            //30|40|null
            //move the iteration one step forward
            current = next;

        }
        //make sure to update the fields for the class
        //10
        last = first;
        last.next = null;
        //40
        first = previous;
    }

    //approach with node parameter
    /*
        Initialize three pointers prev as NULL, curr as head and next as NULL.
        Iterate through the linked list. In loop, do following.
        // Before changing next of current,
        // store next node
        next = curr->next
        // Now change next of current
        // This is where actual reversing happens
        curr->next = prev
        // Move prev and curr one step forward
        prev = curr
        curr = next



        Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
     */
}
