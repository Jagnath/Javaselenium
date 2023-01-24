package day3;


import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("my age is");
        int age = sc.nextInt();
        System.out.println("my name is");
        String name = sc.next();

        System.out.println("Hello," + name +  " I am " + age + " years old");



    }

}
