package day11;

import java.util.ArrayList;

public class Collection_Example2 {

    public static void main(String[] args) {

        ArrayList<String> arlt = new ArrayList<String>();
        arlt.add("Jaggu");
        arlt.add("sachin");
        arlt.add("mahesh");
        arlt.add(1,"shivu");

        System.out.println(arlt);
        System.out.println(arlt.size());
        System.out.println(arlt.get(0));
    }
}