//valueOf(String)

class O {
    public static void main(String[] args) {
        Float a = Float.valueOf("6.5"); //No error no need to specify suffix f
        Float b = Float.valueOf("6.5f"); //No error

        System.out.println(a);
        System.out.println(b);
    }
}