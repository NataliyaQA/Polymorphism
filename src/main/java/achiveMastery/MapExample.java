package achiveMastery;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Kate", "13.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        for(Map.Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        Random random = new Random(30);
        Set<String> numberSet = new HashSet<>();
        numberSet.add("1");
        numberSet.add("10");
        numberSet.add("1");
        numberSet.add("10");
        for (String numberName : numberSet) {
            System.out.println(numberName);
        }
        // the same to for
        numberSet.forEach(numberName -> System.out.println(numberName));
        numberSet.forEach(System.out::println);


    }
}
