// Float and Double objects are never created in constant pool

class K {
    public static void main(String[] args) {
        Double x = Double.valueOf(5.3); //non pool
        Double y = Double.valueOf(5.3); //non pool

        System.out.print(x == y); //false ->  both variable points to different objects in heap
    }
}