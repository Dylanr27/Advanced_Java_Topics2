package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var unknown = new Customer("Unknown", "n/a");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.getOrDefault("e10", unknown);
        var exists = map.containsKey("e1");

        for (var key :
                map.keySet()) {
            System.out.println(key);
        }

        for (var entry :
                map.entrySet()) {
            System.out.println(entry);
        }

        for (var customer1 :
                map.values()) {
            System.out.println(customer1);
        }
        
        System.out.println(customer);
        System.out.println(exists);
        System.out.println(map);

    }
}
