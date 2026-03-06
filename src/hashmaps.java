import java.util.HashMap;

public class hashmaps {

    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.1);
        map.put("Banana", 0.7);
        map.put("Orange", 0.25);
        map.put("Watermelon", 0.5);

//        map.remove("Orange");

//        System.out.println( map.get("Apple")
//        System.out.println(map.containsKey("Apple"));
//        System.out.println(map.containsValue(0.1));
//        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
