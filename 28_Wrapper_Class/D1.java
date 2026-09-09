class D1 {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(127); //Pool
        Integer y = Integer.valueOf(127); //Pool

        System.out.println(x == y); //true
    }
}