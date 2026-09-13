class I {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            Integer num = Integer.valueOf(args[0]);
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Problem Solved");
        }



        System.out.println("End");
    }
}

//input : <no-arg>
// Start
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at I.main(I.java:6)


//input: 12
// Start
//12
// End

//input: ram
// Start
// Problem Solved
// End

//input: 4.5
// Start
// Problem Solved
// End