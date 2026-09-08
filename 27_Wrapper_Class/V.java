class V {
    public static void main(String[] args) {
        Short s = Short.valueOf("42746");
        //NumberFormatException
        //short: -32768 ---- 0 ---- 32767

        System.out.println(s);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"42746" Radix:10
//         at java.base/java.lang.Short.parseShort(Short.java:139)
//         at java.base/java.lang.Short.valueOf(Short.java:193)
//         at java.base/java.lang.Short.valueOf(Short.java:219)
//         at V.main(V.java:3)