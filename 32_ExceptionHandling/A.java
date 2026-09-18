import java.io.FileReader;

class A {
    public static void main(String[] args) {
        aaa();
    }
    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("B");
    }
    static void bbb() {
        System.out.println("C");
        ccc();
        System.out.println("D");
    }
    static void ccc() {
        System.out.println("E");
        
        FileReader fr = new FileReader("Golu.txt"); // it is checked exception and we didnot handled using try catch or declare method so compilation error will occur

        System.out.println("F");
    }
}

// A.java:21: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("Golu.txt"); // it is checked exception and we didnot handled using try catch or declare method so compilation error will occur
//                         ^
// 1 error