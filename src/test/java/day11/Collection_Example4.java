package day11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection_Example4 {
    public static void main(String[] args) {
        ArrayList arlt= new ArrayList();
        arlt.add("Jaggu");
        arlt.add("sachin");
        arlt.add("mahesh");
        arlt.add(10);
        arlt.add(20.35);

        ListIterator itl = arlt.listIterator();
        while (itl.hasNext()){
            System.out.println(itl.next());
        }
        System.out.println("------------------------");
        while (itl.hasPrevious()){
            System.out.println(itl.previous());
        }
    }
}
