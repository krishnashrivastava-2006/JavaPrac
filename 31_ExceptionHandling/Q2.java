class Q2 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassNotFoundException e = new ClassNotFoundException("Haggu gang");

        throw e;
    }
}
// Exception in thread "main" java.lang.ClassNotFoundException: Haggu gang
//         at Q2.main(Q2.java:3)