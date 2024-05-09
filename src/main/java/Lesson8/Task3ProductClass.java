package Lesson8;
import java.util.HashMap;
import java.util.Map;

public class Task3ProductClass {
    public static void main(String[] args) {
        Map<String, String> toyMap = new HashMap<>();
        toyMap.put("Doll", "Barbie");
        toyMap.put("Bear", "Taddy");
        toyMap.put("Fox", "Riky");
        toyMap.put("Unicorn", "Ala");
        System.out.println(toyMap);
        System.out.println("HashMap containing pairs of values - the toy object and the toy name:");
        for (Map.Entry<String, String> entry : toyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("The key and values looks like this:" + toyMap.entrySet());
        System.out.println("Here is only the keys" + toyMap.keySet());
        System.out.println("And here is only the values" + toyMap.values());
    }
}
