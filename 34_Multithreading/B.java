class B {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Thread's name : " + thread.getName());
        System.out.println("Thread's id : " + thread.getId());
        System.out.println("Thread's priority : " + thread.getPriority());
    }
}
// Thread's name : main
// Thread's id : 1
// Thread's priority : 5