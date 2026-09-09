class O2 {
    public static void main(String[] args) {
        double a = 2.7f; //widening conversion -> OK

        // Double b = 3.5f; error
        Double b = (double)2.7f; //TypeCasting

        Double c = a; //AutoBoxing

        System.out.println(a == c); // true -> value compared
        System.out.println(b == c); // false -> referenced compared, and Double objects are never created in constant pool
    }
}