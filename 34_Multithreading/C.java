class MyThread extends Thread {
    public void run() { //overriding
        Thread x = Thread.currentThread();

        System.out.println(x);
    }
}

class C {
    public static void main(String[] args) {
        MyThread x = new MyThread();
        x.setName("Golu");
        x.start();
    }
}

// Thread[Golu,5,main]