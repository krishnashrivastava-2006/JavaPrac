class G1 {
    public static void main(String[] args) {
        Long x = Long.valueOf(127);
        Long y = Long.valueOf(127);

        System.out.println(x == y); //true
        // as 127 lies in the range of constant pool
        // so object will be created in constant pool
        // and both variable will points to thw same object
    }
}