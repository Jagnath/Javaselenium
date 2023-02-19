package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_Set {

    public static void main(String[] args) {
        HashSet arlt = new HashSet();
        arlt.add("Jaggu");
        arlt.add("sachin");
        arlt.add("mahesh");
        arlt.add("mahesh");
        arlt.add(10);
        arlt.add(20.35);

        Iterator itl = arlt.iterator();
        while (itl.hasNext()) {
            System.out.println(itl.next());
        }
    }
}
