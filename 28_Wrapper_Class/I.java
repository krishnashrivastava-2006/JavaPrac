//Boolean class objects are always created in constant pool

class I {
    public static void main(String[] args) {
        Boolean x = Boolean.valueOf(true);
        Boolean y = Boolean.valueOf(true);

        Boolean a = Boolean.valueOf(false);
        Boolean b = Boolean.valueOf(false);

        System.out.println(x == y); //true
        System.out.println(a == b); //true
        System.out.println(a == x); //false
    }
}