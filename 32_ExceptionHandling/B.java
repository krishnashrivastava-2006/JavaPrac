import java.io.FileReader;
import java.io.FileNotFoundException;

class B {
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
    static void bbb(){
        System.out.println("E");
        ccc(); //Error as calling this method might generate checked exception so either catch it or declare to be thrown 
        System.out.println("F");

    }
    static void ccc() throws FileNotFoundException {
        System.out.println("G");
        
        FileReader fr = new FileReader("abc.txt"); //checked exception

        System.out.println("H");

    }
}
// B.java:18: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         ccc(); //Error as calling this method might generate checked exception so either catch it or declare to be thrown
//            ^
// 1 error