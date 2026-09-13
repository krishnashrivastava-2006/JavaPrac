import java.io.FileReader;
import java.io.IOException;

class S1 {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            System.out.println("B");
            new FileReader("Golu.txt");
        } catch(IOException e) {
            System.out.println("Problem Solved");
        }
        System.out.println("D");
    }
}

// A
// B
// Problem Solved
// D
