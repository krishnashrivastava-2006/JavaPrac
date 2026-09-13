class M {
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
        //even tho solution is same dont use direct Exception typ var.
        } catch(ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e) {
            System.out.println("Same solution for all these exception");
        }

        System.out.println("End");
    }
}