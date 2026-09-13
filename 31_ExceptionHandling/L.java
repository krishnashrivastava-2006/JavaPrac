//checked excepions must be either caught using try-catch or declare to be thrown
// else error
import java.io.FileReader;

class L {
    public static void main(String[] args) {
        //The constructor of FileReader might throw a checked exception
        // we have neither handled it using try-catch nor declare it in the method signature
        // thus error at compile time
        FileReader fr = new FileReader("Golu.txt");
    }
}

// L.java:10: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("Golu.txt");
//                         ^
// 1 error