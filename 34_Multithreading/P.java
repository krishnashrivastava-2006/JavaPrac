class PRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++)
            System.out.println(i + " - " + x.getName() + " -run()");
    }
}

class P {
    public static void main(String[] args) {
        Thread thread = new Thread(new PRunnable(), "Golu");
        thread.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 15) {
                try { thread.sleep(1000);} catch(InterruptedException e) { e.printStackTrace();}
                //Since sleep() method is static method so Golu thread is not put on sleep
                //main() method is put on sleep state as sleep() method is called from main thread and not in Golu thread
            }
            System.out.println(i + " - " + x.getName() + " -run()");
        }
        
    }
}

// 0 - main -run()
// 0 - Golu -run()
// 1 - main -run()
// 1 - Golu -run()
// 2 - main -run()
// 2 - Golu -run()
// 3 - Golu -run()
// 3 - main -run()
// 4 - main -run()
// 4 - Golu -run()
// 5 - Golu -run()
// 5 - main -run()
// 6 - main -run()
// 6 - Golu -run()
// 7 - main -run()
// 8 - main -run()
// 7 - Golu -run()
// 8 - Golu -run()
// 9 - Golu -run()
// 10 - Golu -run()
// 11 - Golu -run()
// 12 - Golu -run()
// 13 - Golu -run()
// 14 - Golu -run()
// 9 - main -run()
// 10 - main -run()
// 11 - main -run()
// 12 - main -run()
// 15 - Golu -run()
// 16 - Golu -run()
// 17 - Golu -run()
// 18 - Golu -run()
// 13 - main -run()
// 14 - main -run()
// 19 - Golu -run()
// 20 - Golu -run()
// 21 - Golu -run()
// 22 - Golu -run()
// 23 - Golu -run()
// 24 - Golu -run()
// 25 - Golu -run()
// 26 - Golu -run()
// 27 - Golu -run()
// 28 - Golu -run()
// 29 - Golu -run()
// 15 - main -run()
// 16 - main -run()
// 17 - main -run()
// 18 - main -run()
// 19 - main -run()
// 20 - main -run()
// 21 - main -run()
// 22 - main -run()
// 23 - main -run()
// 24 - main -run()
// 25 - main -run()
// 26 - main -run()
// 27 - main -run()
// 28 - main -run()
// 29 - main -run()