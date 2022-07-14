import CollectionsDemo.Customer;
import CollectionsDemo.EmailComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("a", "e2"));
        customerList.add(new Customer("b", "e1"));
        customerList.add(new Customer("c", "e3"));
        Collections.sort(customerList, new EmailComparator());
        System.out.println(customerList);
    }
}