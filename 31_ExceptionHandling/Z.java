import java.io.FileReader;
import java.io.FileNotFoundException;

class Z {
    public static void main(String[] args) {
        System.out.println("A");
        aaa();
        System.out.println("B");
    }

    static void aaa() {
        System.out.println("C");
        bbb();
        System.out.println("D");
    }
    static void bbb() {
        System.out.println("E");
        ccc();
        System.out.println("F");
    }
    static void ccc() {
        System.out.println("G");
        ddd();
        System.out.println("H");
    }
    static void ddd() {
        System.out.println("I");
        try {
            FileReader fr = new FileReader("Golu.txt");
        } catch(FileNotFoundException e) {
            System.out.println("Problem Solved");
        }
        System.out.println("J");
    }
}

// A
// C
// E 
// G 
// I 
// Problem Solved
// J 
// H 
// F 
// D 
// B