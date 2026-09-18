//catch block can also throw an exception
class R {
    public static void main(String[] args) {
        pro();
    }
    static void pro() {
        try {
            int z = 29/0;
        } catch(ArithmeticException e) {
            throw new NullPointerException();
        }
    }
}
// Exception in thread "main" java.lang.NullPointerException
//         at R.pro(R.java:10)
//         at R.main(R.java:4)