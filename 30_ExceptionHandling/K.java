class K {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            int i = Integer.valueOf(args[0]);
            System.out.println("Step A");

            int[] k = {1,2,0};
            int n = k[i];
            System.out.println("Step B");

            int z = 34/n;
            System.out.println("Step C");


        } catch(Exception e) { // <- Unreliable code even tho solution is same for all exceptions
        // but using Exception type  variable shows that developer can not anticipate the types of exceptions that might come
        
            System.out.println("Problem Solved");
            System.out.println(e);
        }


        System.out.println("End");
    }
}
// D:\JavaPrac_2\30_ExceptionHandling>java K
// Start
// Problem Solved
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// End

// D:\JavaPrac_2\30_ExceptionHandling>java K 12
// Start
// Step A
// Problem Solved
// java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 3
// End

// D:\JavaPrac_2\30_ExceptionHandling>java K 2
// Start
// Step A
// Step B
// Problem Solved
// java.lang.ArithmeticException: / by zero
// End

// D:\JavaPrac_2\30_ExceptionHandling>java K 0
// Start
// Step A
// Step B
// Step C
// End