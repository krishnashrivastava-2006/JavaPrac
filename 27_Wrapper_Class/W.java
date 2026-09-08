class W {
    public static void main(String[] ars) {
        Short s = Short.valueOf("34000");

        //short: -32768 --- 0 --- 32767


    }
}

// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"34000" Radix:10
//         at java.base/java.lang.Short.parseShort(Short.java:139)
//         at java.base/java.lang.Short.valueOf(Short.java:193)
//         at java.base/java.lang.Short.valueOf(Short.java:219)
//         at W.main(W.java:3)