class L {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            int i = Integer.valueOf(args[0]);
            System.out.println("Step A");

            int[] arr = {1,2,0};
            int x = arr[i];
            System.out.println("Step B");

            int y = 12/x;
            System.out.println("Step C");

            //Different catch block for Different exceptions
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Solution for AIOOBE");
        } catch(NumberFormatException e) {
            System.out.println("Solution for NFE");
        } catch(ArithmeticException e) {
            System.out.println("Solution for AE");
        }


        System.out.println("End");
    }
}

// D:\JavaPrac_2\30_ExceptionHandling>java L
// Start
// Solution for AIOOBE
// End

// D:\JavaPrac_2\30_ExceptionHandling>java L 1
// Start
// Step A
// Step B
// Step C
// End

// D:\JavaPrac_2\30_ExceptionHandling>java L 23
// Start
// Step A
// Solution for AIOOBE
// End

// D:\JavaPrac_2\30_ExceptionHandling>java L e
// Start
// Solution for NFE
// End

// D:\JavaPrac_2\30_ExceptionHandling>java L 2
// Start
// Step A
// Step B
// Solution for AE
// End