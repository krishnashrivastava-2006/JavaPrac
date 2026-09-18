import java.io.IOException;
import java.io.FileNotFoundException;

class Y {
    public void pro() throws IOException {

    }
}

class Y1 extends Y {
    public void pro() throws FileNotFoundException { // Narrower Exception -> No error

    }
}