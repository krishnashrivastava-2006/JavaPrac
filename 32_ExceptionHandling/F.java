import java.io.FileReader;
import java.io.FileNotFoundException;
class F {
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
        try {
            ddd();
        } catch(FileNotFoundException e) {
            System.out.println("Problem Solved");
        }
        System.out.println("H");
    }
    static void ddd() throws FileNotFoundException {
        System.out.println("I");
        
        FileReader fr = new FileReader("a.txt");

        System.out.println("J");
    }
}
// A
// C
// E
// G
// I
// Problem Solved
// H
// F
// D
// B