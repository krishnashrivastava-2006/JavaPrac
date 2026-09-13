import java.util.Scanner;

class Z {
    public static void main(String[] str) {
        try(Scanner sc = new Scanner(System.in)) {
            //it will automatically close the connection when use is completed 
            // it is used so that developer does not forget to close the connectiojn
            //as it can lead to memory leaks or performance issues
        }
    }
}