class C {
    public static void main(String[] args) {
        Integer x = new Integer(12); //non pool
        Integer y = Integer.valueOf(12); //pool

        System.out.print(x == y); //false -> both variable points to different objects in heap
        
    }
}