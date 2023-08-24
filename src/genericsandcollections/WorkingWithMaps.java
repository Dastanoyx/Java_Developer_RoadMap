package genericsandcollections;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("Yassin", 28);
        nameAgesMap.put("Tanen", 29);
        nameAgesMap.put("Assta", 28);
        nameAgesMap.put("fou3a", 29);

        System.out.println(nameAgesMap);
        System.out.println(nameAgesMap.get("Yassin"));

        for(Integer i : nameAgesMap.values()){
            System.out.println(i);
        }

        for(String s : nameAgesMap.keySet()){
            System.out.println(s + ":  " + nameAgesMap.get(s));
        }

        for(Map.Entry<String, Integer> entry: nameAgesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        nameAgesMap.remove("Tanen");
        nameAgesMap.put("khalil", 27);

        System.out.println(nameAgesMap);

    }
}
