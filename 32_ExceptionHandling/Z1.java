import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

class ZZ {
    public void pro() throws IOException {

    } 
}

class ZZ1 extends ZZ {
    public void pro() throws FileNotFoundException, EOFException { // Narrower Exception -> No Error

    }
}