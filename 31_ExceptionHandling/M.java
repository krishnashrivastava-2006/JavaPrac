import java.io.FileReader;
import java.io.FileNotFoundException;

class M {
    public static void main(String[] argd) {
        //Checked Exception Handled using try-catch
        try {
            FileReader fr = new FileReader("Golu.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
// java.io.FileNotFoundException: Golu.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at M.main(M.java:8)
