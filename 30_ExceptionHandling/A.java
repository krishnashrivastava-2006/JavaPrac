class A {
    public static void main(String[] args) {
        System.out.println("start");

        int x = 12/0; //when an exception occurs the program will terminate or crash

        System.out.println("end"); //the next line of code will not be executed
    }
}

// start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:5)