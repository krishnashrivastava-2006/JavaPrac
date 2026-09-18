import java.io.IOException;
// import java.io.ClassNotFoundException;

class X {
    public void pro() throws IOException {

    }
}

class X1 extends X {
    public void pro() throws ClassNotFoundException { // Newer Exception -> Error

    }
}

// X.java:11: error: pro() in X1 cannot override pro() in X
//     public void pro() throws ClassNotFoundException { // Newer Exception -> Error
//                 ^
//   overridden method does not throw ClassNotFoundException
// 1 error