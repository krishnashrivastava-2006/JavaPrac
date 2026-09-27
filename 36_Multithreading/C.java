import java.util.Scanner;


class C1Runnable implements Runnable {
    public void run() {
        while(true) {
            C.circle.writeRadius();
        }
    }
}
class C2Runnable implements Runnable {
    public void run() {
        while(true) {
            C.circle.readRadius();
        }
    }
}

class C {
    static Circle circle = new Circle();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new Thread(new C1Runnable(), "Producer").start();
        new Thread(new C2Runnable(), "Consumer").start();
    }
}