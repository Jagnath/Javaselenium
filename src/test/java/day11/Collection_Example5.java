package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_Example5 {
    public static void main(String[] args) {
        ArrayList arlt = new ArrayList();
        arlt.add("Jaggu");
        arlt.add("sachin");
        arlt.add("mahesh");
        arlt.add(10);
        arlt.add(20.35);

        Iterator itl = arlt.iterator();
        while (itl.hasNext()) {
            System.out.println(itl.next());
        }
    }
}