//if we explicitly type casted then there is risk of possible lossy conversion
// it is programers responsibility to take the risk
// and explicitly type cast 

class U {
    public static void main(String[] args) {
        Byte x = (byte)128;
        Short y = (short)32769;
        Character z = (char)-56;
        Character z1 = 67;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z1);
    }
}