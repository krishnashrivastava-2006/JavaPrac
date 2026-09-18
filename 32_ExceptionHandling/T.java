//Sometimes catch block does not have enough ingredients or factors to solve a particular problem s it can
// rethrow the exception which it catched earlier

class T {
    public static void main(String[] args) {
        System.out.println("------------Start-------------");

        try {
            System.out.println(args[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            //required ingredients or factors to sole the problem are unavailable
            //rethrow the exception

            throw e;
        }


        System.out.println("------------End---------------");
    }
}
// ------------Start-------------
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at T.main(T.java:9)