//Byte objects and Boolean objects are always created in constant pool

class E {
    public static void main(String[] args) {
        // byte a = 128; // error: possible lossy conversion
        // byte a = 127; //ok
        byte a = -128;

        // Byte x = Byte.valueOf(127); //error
        Byte x = Byte.valueOf(a); //Pool range: -128 --- 0 --- 127
        Byte y = Byte.valueOf(a); //Pool

        System.out.println(x == y); //true -> both points to same object in heap
    }
}