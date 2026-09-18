class Q {
    public static void main(String[] args) {
        System.out.println(pro());
    }

    static int pro() {
        try {
            int z = 97/0;
        } catch(ArithmeticException e) {
            return 100; 
        } finally {
            return 200; //this will be returned
        }

        // return 0; unreachable statement
    }
} 