//Already Alive Thread ko Daemon Thread nhi bana sakte
//IllegalThreadStateException

class D {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 15){
                t.setDaemon(true);
            }
            System.out.println(i + " - " + t.getName());
        }
    }
}
// 0 - main
// 1 - main
// 2 - main
// 3 - main
// 4 - main
// 5 - main
// 6 - main
// 7 - main
// 8 - main
// 9 - main
// 10 - main
// 11 - main
// 12 - main
// 13 - main
// 14 - main
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at D.main(D.java:7)