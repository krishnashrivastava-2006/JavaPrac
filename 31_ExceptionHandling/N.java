import java.io.FileReader;
import java.io.FileNotFoundException;

class N {
    public static void main(String[] args) throws FileNotFoundException {
        //checked exception declared in conatiner method signature using throws keyword
        FileReader fr = new FileReader("golu.txt");
        System.out.println("AAA");
    }
}
// Exception in thread "main" java.io.FileNotFoundException: golu.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at N.main(N.java:7)