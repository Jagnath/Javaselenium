package day2;

public class SwapTwoNum {
    public static void main(String[] args) {
        // Before swaping
        int a=20;
        int b=40;
        int temp=a;
        System.out.println("Before swaping" + a+" "+b);
        // After Swaping
        a=b;
        b=temp;
        System.out.println("After swaping" + a+" "+b);
    }
}
