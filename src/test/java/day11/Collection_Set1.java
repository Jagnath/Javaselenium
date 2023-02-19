package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_Set1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);
        for (int value:hs){
           // System.out.println(value);

        }
        Iterator itl = hs.iterator();
        while (itl.hasNext()) {
            System.out.println(itl.next());

        }
    }
}
