class U {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("124",2);
        //NumberFormatException as the String is not of radix 2

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "124" under radix 2
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at U.main(U.java:3)