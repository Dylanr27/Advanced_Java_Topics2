package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collection<String> collectionToCompare = new ArrayList<>();
        collection.add("a");
        Collections.addAll(collection, "b", "c", "d");
        collectionToCompare.addAll(collection);
        collection.remove("a");
        collection.contains("b");
        collection.clear();
        collection.size();
        Object[] objArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);
        for (var item :
                collection) {
            System.out.println(item);
        }

    }
}
