//frame memory is allocated for static block in call stack
// if some exception arises inside static block the class loading fails
// and the stack dissolved without even running the main method
// so main method is never executed if some exception arises inside static block


//ExceptionInitializerError <- System Failure

class I {
    static {
        System.out.println("Start");

        int y = 79/0;

        System.out.println("End");
    }

    public static void main(String[] args) {
        System.out.println("Hello World....");
    }
}

// Start
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at I.<clinit>(I.java:10)