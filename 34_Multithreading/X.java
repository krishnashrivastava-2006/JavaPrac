//DeadLock Situation
// a thread is joining itself
// thread is permanently blocked


class X {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();


        for (int i = 0; i < 29; i++) {
            if( i == 10)
                try { x.join(); } catch(InterruptedException e) {}

            System.out.println(i + " - " + x.getName());
        }
    }
}