package day11;

public class Arrays_Example4 {
    public static void main(String[] args) {

        String[] names=new String[4];
        names[0] = "jaggu";
        names[1] = "vinay";
        names[2] = "mallu";
        names[3] = "sachin";

        System.out.println(names.length);
        for (String ref : names){
            System.out.println(ref);
        }
    }
}
