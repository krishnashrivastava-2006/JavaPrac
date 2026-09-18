import java.io.FileReader;
import java.io.FileNotFoundException;

class E {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A");
        aaa(); 
        System.out.println("B");
    }
    static void aaa() throws FileNotFoundException {
        System.out.println("C");
        bbb();
        System.out.println("D");

    }
    static void bbb() throws FileNotFoundException {
        System.out.println("E");
        ccc(); 
        System.out.println("F");

    }
    static void ccc() throws FileNotFoundException {
        System.out.println("G");
        
        FileReader fr = new FileReader("abc.txt"); //checked exception

        System.out.println("H");

    }
}
// A
// C
// E
// G
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at E.ccc(E.java:25)
//         at E.bbb(E.java:18)
//         at E.aaa(E.java:12)
//         at E.main(E.java:7)