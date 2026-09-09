class D {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(128); //Non constant pool
        Integer y = Integer.valueOf(128); //Non constant pool
        // constant pool has a fixed range: -128 --- 0 --- 127

        System.out.println(x == y); //false
        // both points to different objects in heap
    }
}