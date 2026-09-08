class R {
    public static void main(String[] args) {
        Float x = Float.valueOf("36.3ad3"); //In Parsable value -> NumberFormatException

        Double y = Double.valueOf("3745.8628s");
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "36.3ad3"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
//         at java.base/java.lang.Float.parseFloat(Float.java:476)
//         at java.base/java.lang.Float.valueOf(Float.java:440)
//         at R.main(R.java:3)