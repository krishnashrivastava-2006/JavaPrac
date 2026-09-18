import java.io.IOException;
import java.io.FileNotFoundException;

class Z {
    public void pro() throws FileNotFoundException {

    }
}

class Z1 extends Z {
    public void pro() throws IOException { // Wider Exception -> Error

    }
}

// Z.java:11: error: pro() in Z1 cannot override pro() in Z
//     public void pro() throws IOException { // Wider Exception -> Error
//                 ^
//   overridden method does not throw IOException
// 1 error