package day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assingment2 {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"JagnathNotes";
        File fl=new File(path);
        FileWriter write=new FileWriter(fl);
        BufferedWriter wr= new BufferedWriter(write);
        wr.write("Jagnath");
        wr.flush();
       System.out.println("Yes data entered");
    }
}
