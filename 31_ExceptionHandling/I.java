//try catch block doesnot disturb the flow of execution

class I {
    public static void main(String[] args) {
        System.out.println(" Step A");

        try {

        } catch (ArithmeticException e) {

        }
        System.out.println(" Step B");
        System.out.println(" Step C");

        try {

        } catch(ArrayIndexOutOfBoundsException e) {

        } finally {

        }
        System.out.println(" Step D");
        System.out.println(" Step E");
    }
}
//  Step A
//  Step B
//  Step C
//  Step D
//  Step E
