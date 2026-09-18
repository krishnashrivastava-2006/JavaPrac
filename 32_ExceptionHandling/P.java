class P {
    public static void main(String[] args) {
        System.out.println(pro());
    }
    static int pro() {
        if(12 < 13)
            return 300; // conditionally
        return 600; // so no error after writing a return statement
    }
}