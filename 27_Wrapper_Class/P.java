//valueOf(String) -> doesnt matter if suffix is passed or not

class P {
    public static void main(String[] args) {
        Double a = Double.valueOf("34.3f"); //no error
        Double b = Double.valueOf("34.3"); //no error

        System.out.println(a);
        System.out.println(b);
    }
}