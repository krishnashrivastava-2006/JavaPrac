class F {
    public static void main(String[] args) {
        System.out.println("Start");

        int[] x = {1,2,3};
        try {
            System.out.println(x[3]); //problem generating code -> exception occurs
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem Solved"); //-> catch the exception 
        }


        System.out.println("End");
    }
}

// Start
// Problem Solved
// End