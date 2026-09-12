class D {
    public static void main(String[] args) {
        System.out.println("Start");

        Integer x = Integer.valueOf("a2"); //NumberFormatException -> program terminated


        System.out.println("End"); // not executed
    }
}

// Start
// Exception in thread "main" java.lang.NumberFormatException: For input string: "a2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.valueOf(Integer.java:999)
//         at D.main(D.java:5)