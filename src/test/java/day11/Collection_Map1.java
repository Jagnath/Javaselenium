package day11;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map1 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(17, "Jaggu");
        m.put(18, "virat");
        m.put(10, "sachin");
        m.put(45, "rohit");
        System.out.println(m);
        for (Map.Entry<Integer, String> val : m.entrySet()) {
            System.out.println(val);

        }
    }
}