//Method Overriding
// fewer or narrower -> ok
// newer or wider  -> not ok // error
import java.io.IOException;

class V {
    void pro(int x) throws IOException{

    }
}

class V1 extends V{
    void pro(int h) throws IOException { //Same Exception -> no error

    }
}