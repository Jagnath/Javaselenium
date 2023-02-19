package day11;

import java.util.ArrayList;

public class Collection_Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> num= new  ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(36);
        num.add(33);

        System.out.println(num);
        for (int i=0; i<num.size() ; i++){
            if (i==2){
                System.out.println("SKIP");
            }else {
                System.out.println(num.get(i));
            }
        }

    }
}
