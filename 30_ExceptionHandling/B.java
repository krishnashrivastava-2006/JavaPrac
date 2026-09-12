class B {
    public static void main(String[] args) {
        System.out.println("Start");

        int[] a = {14,54,32};
        System.out.println(a[3]); //index 3 is out of bounds (program terminated)

        System.out.println("End"); //not executed
    }
}
// Start
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at B.main(B.java:6)