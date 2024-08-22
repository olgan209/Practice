package second;

import java.util.HashMap;

public class MapsStudy {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Andrews", 12345);
        empIds.put("John Doe", 4321);
        empIds.put("Jane Doe", 4121);

        System.out.println(empIds);

        System.out.println(empIds.get("Andrews"));
        System.out.println(empIds.containsKey("John Doe"));
        System.out.println(empIds.containsValue(4321));

        empIds.put("John Doe", 43214);
        System.out.println(empIds);

        empIds.replace("Kramer", 434);

        empIds.putIfAbsent("Kramer", 434);

        empIds.remove("Kramer");
    }
}
