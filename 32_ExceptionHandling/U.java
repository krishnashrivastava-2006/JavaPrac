//change the exception -> we show a different exception

class U {
    public static void main(String[] args) {
        String[] x = {"1o", "20", "30"};
        System.out.println("-----------start-------------");

        try {
            int u = Integer.valueOf(x[Integer.parseInt(args[0])]);
            System.out.println(u);
        } catch(NumberFormatException e) {
            //change and rethrow the exception
            throw new NullPointerException();
        }

        System.out.println("-----------end---------------");
    }
}
// D:\JavaPrac_2\32_ExceptionHandling>java U 0
// -----------start-------------
// Exception in thread "main" java.lang.NullPointerException
//         at U.main(U.java:13)
