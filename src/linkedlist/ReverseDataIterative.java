package linkedlist;

import linkedlist.structure.LinkedList;

public class ReverseDataIterative {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        
        linkedList.reverseDataIterative();
        linkedList.print();
    }

}
