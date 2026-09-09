class N1 {
    public static void main(String[] args) {
        long x = 35; //widening conversion int to long

        Long y = 35L; //autoboxing

        System.out.println(x == y); // true -> y will be unboxed for comparison with primitive
    }
}