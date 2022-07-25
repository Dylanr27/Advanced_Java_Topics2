import CollectionsDemo.Customer;
import CollectionsDemo.MapDemo;
import CollectionsDemo.SetDemo;
import LinkedLists.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(list.getTheKthNodeFromEnd(1));
    }
}