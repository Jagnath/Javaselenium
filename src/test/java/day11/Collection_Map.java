package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection_Map {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(17, "Jaggu");
        m.put(18, "virat");
        m.put(10, "sachin");
        m.put(45, "rohit");
        m.put(45, "");
        System.out.println(m.get(18));
        System.out.println(m);
        System.out.println(m.remove(10, "sachin"));


        }

    }

