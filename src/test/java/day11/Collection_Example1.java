package day11;

import java.util.ArrayList;

public class Collection_Example1 {
    public static void main(String[] args) {

        ArrayList arlt= new ArrayList();
        arlt.add("Jaggu");
        arlt.add("sachin");
        arlt.add("mahesh");
        arlt.add(10);
        arlt.add(20.35);

        System.out.println(arlt);

        for (Object ref: arlt){
            System.out.println(ref);

        }

    }
}
