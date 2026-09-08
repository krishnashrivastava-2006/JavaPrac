//The spelling of true must be correct case insensitively
//otherwise it would be treated as false

class B {
    public static void main(String[] args) {
        Boolean flag1 = new Boolean("TruE");
        Boolean flag2 = new Boolean("Tru");
        Boolean flag3 = new Boolean("jdgsj");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
    }
}