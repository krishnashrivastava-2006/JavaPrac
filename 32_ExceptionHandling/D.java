import java.io.FileReader;
import java.io.FileNotFoundException;

class D {
    public static void main(String[] args) {
        System.out.println("A");
        aaa(); //Error as calling this method might generate checked exception so either catch it or declare to be thrown 
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
// D.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         aaa(); //Error as calling this method might generate checked exception so either catch it or declare to be thrown
//            ^
// 1 error