//Long class
//valueOf(long) -> static method

class H {
    public static void main(String[] args) {
        Long a = new Long(654796984629649L); //deprecated

        Long b = Long.valueOf(76924709749282L);

        System.out.println(a);
        System.out.println(b);
    }
}