class F1 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        System.out.println("Start-----------");
        try {
            System.out.println(x[0]); // no exception
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem Solved"); // only executed if exception occurs inside the try block
        }
        System.out.println("End--------------");
    }
}

// Start-----------
// 1
// End--------------