package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1,"!");
        Collections.addAll(list, "uno", "dos", "tres");
        System.out.println(list);
        System.out.println(list.get(0));

    }
}
