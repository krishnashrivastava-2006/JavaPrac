class F {
    public static void main(String[] args) {
        // short a = 127; //->true
        short a = 128; //->false as 128 is out of pool range

        Short x = Short.valueOf(a);
        Short y = Short.valueOf(a);

        System.out.println(x == y);
    }
}