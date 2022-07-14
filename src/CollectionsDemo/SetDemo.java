package CollectionsDemo;

import java.util.*;

public class SetDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "bravo","alpha", "bravo", "charlie", "delta");
        Set<String> set = new HashSet<>(collection);
        Set<String> set2 = new HashSet<>(Arrays.asList("alpha", "bravo", "bravo", "charlie", "echo"));
        set.retainAll(set2);
        set.removeAll(set2);
        System.out.println(set);
    }
}
