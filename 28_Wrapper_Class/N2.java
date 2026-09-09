class N2 {
    public static void main(String[] args) {
        long a = 34; //widening conversion

        Long b = 34L; //Autoboxing

        Long c = (long)34; //we explicitly typecasted

        System.out.println(b == c); // reference code compared ->true
        System.out.println(b == a); // value comapred -> true
    }
}