import java.io.IOException;
//NO error

class W {
    public void info(int x, float y) throws IOException {
        
    }
}

class W1 extends W {
    public void info(int y, float x) { // Fewer Exception

    }
}