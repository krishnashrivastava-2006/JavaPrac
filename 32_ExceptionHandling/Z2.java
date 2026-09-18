import java.io.IOException;

class Z2 {
    public void pro() throws IOException {

    }
}

class ZZ2 extends Z2 {
    //No Error
    //Because its method overloading not overriding
    public void pro(int x) throws ClassNotFoundException {

    }
}