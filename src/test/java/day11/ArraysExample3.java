package day11;

public class ArraysExample3 {
    public static void main(String[] args) {

        String[] name = {"Jaggu", "mallu", "ganu", "vinay"}; //String arrays

        int[] num = {1, 3, 5, 4, 6};  // Int arrays

        System.out.println(name.length);

        System.out.println(num.length);

        for(int value:num){
            System.out.println(value);
        }
        for(String value:name){
            System.out.println(value);
        }
    }
}