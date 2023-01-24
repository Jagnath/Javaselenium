package day2;

public class SwapWithoutUsingV {
    public static void main(String[] args) {
        //before swapping
        int a=40;
        int b=10;
        System.out.println("swapping two numbers without using third variable");
        System.out.println("before swapping " + a + " "+ + b);
        //after swapping without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping " + a +" "+ + b);
    }
}
