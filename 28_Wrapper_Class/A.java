//new keyword creates fresh new object in non constant pool
// so even though both variable contains same value
// but both points to different objects in non pool

class A {
    public static void main(String[] args) {
        Integer a = new Integer(23);
        Integer b = new Integer(23);

        System.out.println(a == b); //false
    }
}