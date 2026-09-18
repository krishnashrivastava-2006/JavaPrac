class K {
    public static void main(String[] args) {
        try {
            int z = 90/0;
        } catch(ArithmeticException e) {
            System.out.println("Problem Solved");
            System.out.println("---------------------------");
            e.printStackTrace();
            System.out.println("---------------------------");
            System.out.println(e.getMessage());
        }
    }
}