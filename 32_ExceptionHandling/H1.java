class H1 {
    public static void main(String[] args) {
        try {
            int y = 34/0;

            Class.forName("ABC");

        } catch(Exception e) {
            System.out.println("Problem Solved");
        }
    }
}