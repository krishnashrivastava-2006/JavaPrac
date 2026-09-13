class J {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            Integer x = Integer.valueOf(args[0]);
            System.out.println(x);
        } catch(Exception e) {  //<= catch-all block (unreliable code)
            System.out.println("Problem Solved");
        }

        System.out.println("End");
    }
}
// D:\JavaPrac_2\30_ExceptionHandling>java J
// Start
// Problem Solved
// End

// D:\JavaPrac_2\30_ExceptionHandling>java J 12
// Start
// 12
// End

// D:\JavaPrac_2\30_ExceptionHandling>java J ram
// Start
// Problem Solved
// End

// D:\JavaPrac_2\30_ExceptionHandling>java J 4.6
// Start
// Problem Solved
// End
