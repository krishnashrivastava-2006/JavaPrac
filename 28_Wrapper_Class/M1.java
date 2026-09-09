class M1 {
    public static void main(String[] args) {
        Integer x = 128; //Non Pool
        Integer y = 128; //Non Pool

        System.out.println(x == y); //false -> both points to different objects in non pool
    }
}