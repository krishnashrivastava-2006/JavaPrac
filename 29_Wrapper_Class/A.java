//Polymorphic Assignment
// Boxing then conversion


class A {
    public static void main(String[] args) {
        Number a = Byte.valueOf((byte)45);
        Number b = Short.valueOf((short)27);
        Number c = Integer.valueOf(38);
        Number d = Long.valueOf(86);
        Number e = Float.valueOf(29);
        Number f = Double.valueOf(83);

        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
// 45
// 27
// 38
// 86
// 29.0
// 83.0