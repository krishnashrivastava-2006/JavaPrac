class JThread extends Thread {
    public void run() {
        System.out.println("Hello World...");
    }
}

class J {
    public static void main(String[] args) {
        JThread a = new JThread();
        JThread b = new JThread();
        JThread c = new JThread();
        JThread d = new JThread();

        System.out.println(a.getName() + " - " + a.getId() + " - " + a.getPriority() + " - " + a.isAlive());
        System.out.println(b.getName() + " - " + b.getId() + " - " + b.getPriority() + " - " + b.isAlive());
        System.out.println(c.getName() + " - " + c.getId() + " - " + c.getPriority() + " - " + c.isAlive());
        System.out.println(d.getName() + " - " + d.getId() + " - " + d.getPriority() + " - " + d.isAlive());
    }
}

// Thread-0 - 15 - 5 - false
// Thread-1 - 16 - 5 - false
// Thread-2 - 17 - 5 - false
// Thread-3 - 18 - 5 - false