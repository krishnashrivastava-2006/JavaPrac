//Float and Double objects are never created in constant pool

class J {
    public static void main(String[] args) {
        Float x = Float.valueOf(4.5f); //non pool
        Float y = Float.valueOf(4.5f); //non pool

        System.out.println(x == y); //false -> both variable points to different objects
    }
}