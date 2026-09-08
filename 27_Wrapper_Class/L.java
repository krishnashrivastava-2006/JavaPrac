//Integer class
// valueOf(String)
// if we pass any String value which is not parsable to int then it will arise
//  NumberFormatException


class L {
    public static void main(String[] args) {
        // Integer x = Integer.valueOf("57a70"); not parsable
        Integer x = Integer.valueOf("5.0");  //not parsable

        System.out.println(x);
    }
}



// Exception in thread "main" java.lang.NumberFormatException: For input string: "57a70"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.valueOf(Integer.java:999)
//         at L.main(L.java:7