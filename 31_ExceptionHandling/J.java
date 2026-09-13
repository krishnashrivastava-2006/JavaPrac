import java.util.Scanner;
//try with resource declaration,catch and finally -> no error(legal)
//try catch block doesnot disturb the flow of execution
class J {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        try(Scanner sc = new Scanner(System.in)) {

        } catch(NullPointerException e) {

        } finally {

        }
        System.out.println("C");
        System.out.println("D");
    }
}