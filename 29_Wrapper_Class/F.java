class F {
    public static void main(String[] args) {
        //AutoBoxing
        pro(37); // Boxing : (primitive) int - > Integer object
    }   

    static void pro(Integer x) {
        System.out.println(x);
    }
}