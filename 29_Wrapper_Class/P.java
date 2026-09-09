class P {
    public static void main(String[] args) {
        boolean a = Boolean.parseBoolean("Tru");
        boolean b = Boolean.parseBoolean("tRuE");

        System.out.println(a); //false
        System.out.println(b); //true
    }
}