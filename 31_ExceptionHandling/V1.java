import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class V1 {
    public static void main(String[] args) {
        System.out.println("Step A");

        try {
            new File("C:\\windows\\golu.txt").createNewFile(); //=> IOException
            new FileReader("golu.txt"); //=> FileNotFoundException
        } catch(FileNotFoundException e) {
            System.out.println("FileNotFoundExcepion");
        } catch(IOException e) {
            System.out.println("IOExcepion");
        }



        System.out.println("Step D");
    }
}