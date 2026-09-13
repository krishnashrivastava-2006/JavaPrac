import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class V {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            new FileReader("Golu.txt");
        } catch(IOException e) {

        } catch(FileNotFoundException e) { //=> child of IOException

        }
        System.out.println("B");

    }
}

// V.java:13: error: exception FileNotFoundException has already been caught
//         } catch(FileNotFoundException e) {
//           ^
// 1 error