class O {
    public static void main(String[] args) {
        ThreadGroup systg = Thread.currentThread().getThreadGroup().getParent();

        systg.list();
    }
}

// java.lang.ThreadGroup[name=system,maxpri=10]
//     Thread[Reference Handler,10,system]
//     Thread[Finalizer,8,system]
//     Thread[Signal Dispatcher,9,system]
//     Thread[Attach Listener,5,system]
//     Thread[Notification Thread,9,system]
//     java.lang.ThreadGroup[name=main,maxpri=10]
//         Thread[main,5,main]
//     java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
//         Thread[Common-Cleaner,8,InnocuousThreadGroup]