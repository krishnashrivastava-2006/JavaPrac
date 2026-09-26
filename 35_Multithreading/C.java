class C {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + " -Threads's Priority : " + thread.getPriority());

        thread.setPriority(9);
    
        System.out.println(thread.getName() + " -Threads's Priority : " + thread.getPriority());
    }
}

// main -Threads's Priority : 5
// main -Threads's Priority : 9
