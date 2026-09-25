// we cannot declare InterruptedException in run() method as it will violate the method overriding clause
// only fewer or narrower is allowed
// so we have to use try-catch only

class QRunnable implements Runnable {
    public void run() throws InterruptedException {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " - " + x.getName() + " -run()");
        }
    }
}

// Q.java:6: error: run() in QRunnable cannot implement run() in Runnable
//     public void run() throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error