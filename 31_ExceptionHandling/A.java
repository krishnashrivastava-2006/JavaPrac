class AA implements AutoCloseable {
    public void close() {

    }
}


class A {
    public static void main(String[] args) {
        try(AA aa = new AA()) { //it must be AutoCloseable
            
        }
    }
}