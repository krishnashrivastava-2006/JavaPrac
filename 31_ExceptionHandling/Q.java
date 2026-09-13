class Q {
    public static void main(String[] args) {
        ClassNotFoundException e = new ClassNotFoundException("HAggu geng");

        throw e;
        //compilation error as it is a checked exception so either have to caught it using try-catch block or method declaration
    }
}

// Q.java:5: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//         throw e;
//         ^
// 1 error