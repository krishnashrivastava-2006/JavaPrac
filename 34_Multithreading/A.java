class A {
    public static void main(String[] args) {
        Thread a = Thread.currentThread();

        System.out.println(a); //Thread[main,5,main] //thread name, thread priority, thread group
    }
}