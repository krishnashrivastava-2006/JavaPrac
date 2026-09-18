//similarly if we are explicitly throwing an exception unconditionally then if we write any statement after it error will occur
//as it will be unreachable statement


//when throw or return statement is encountered the method gets popped from the call stack

class P3 {
    public static void main(String[] args) {
        throw new ArithmeticException();

        System.out.println("Hello World"); //Error
    }
}

// P3.java:11: error: unreachable statement
//         System.out.println("Hello World"); //Error
//         ^
// 1 error
