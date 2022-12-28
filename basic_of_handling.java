import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) throws IOException {
        File myfile=new File("my_file.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("file cannot be make");
            throw new RuntimeException(e);
        }


        // for writing in the file
        /*

        FileWriter fileWriter=new FileWriter("my_file.txt");
        fileWriter.write("hello file handling\n hope u good");
        fileWriter.close();
         */



        // for deleting the file
        /*
        File ok=new File("my_file.txt");
        if (ok.delete()){
            System.out.println("deleted");
        }
        else {
            System.out.println("error is occured");
        }

         */


        //for priting the value in the file
        /*
        File myfile=new File("my_file.txt");
        System.out.println();

        Scanner s=new Scanner(myfile);
        while (s.hasNextLine()) {
            String rf = s.nextLine();
            System.out.println(rf);
        }
        s.close();*/


    }
}
