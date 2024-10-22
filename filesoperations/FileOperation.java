package filesoperations;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOperation {

    public static void main(String[] args) throws FileNotFoundException {
        try(FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Study Material\\Java Problems\\output.txt", true);) {
            System.out.println("Add data here");
//            DataInputStream inputStream = new DataInputStream(System.in);

            String input = "akash,tejas,kamble,seema";
            String[] inputArray = input.split(",");

            for (String str : inputArray){
                outputStream.write(str.getBytes());
                outputStream.write(System.lineSeparator().getBytes());
            }

        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }
}
