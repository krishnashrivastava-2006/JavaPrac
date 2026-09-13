class Q1 {
    public static void main(String[] args) {
        ClassNotFoundException e = new ClassNotFoundException("jay...");

        try {
            throw e;
        } catch(ClassNotFoundException e1) {
            System.out.println("Problem solved");
        }
    }
}