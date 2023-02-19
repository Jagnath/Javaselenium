package day11;

public class Arrays_String_Int {
    public static void main(String[] args) {

        String[] name = {"Jaggu", "mallu", "ganu", "vinay"}; //String arrays

        int[] num = {1, 3, 5, 4, 6};  // Int arrays

        System.out.println(name[2]);

        System.out.println(num[1]);

        for (int i = 0; i < name.length; i++) {
            System.out.println("total count from the string " + name[i]);

        }
        for (int j = 0; j < name.length; j++) {
            System.out.println("total count from the int " + num[j]);
        }
    }
}