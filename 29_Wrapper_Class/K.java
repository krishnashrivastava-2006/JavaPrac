// 6 Numeric Wrapper Classes
// Byte, Short, Integer, Long, Float, Double
// 6 Non static methods
// wrapper class object -> primitive type
// 1. byteValue()
// 2. shortValue()
// 3. intValue()
// 4. longValue()
// 5. floatValue()
// 6. doubleValue()
// risk of possible lossy conversion see line 18 and line 25

class K {
    public static void main(String[] args) {
        Byte a = 69;
        Short b = 753;
        // Character c = 48;
        Integer d = 982;
        Long e = 45L;
        Float f = 3.4f;
        Double g = 7.3;

        System.out.println(a.floatValue());
        System.out.println(b.doubleValue());
        System.out.println(d.byteValue());
        System.out.println(e.floatValue());
        System.out.println(f.intValue());
        System.out.println(g.byteValue());
        System.out.println(g.intValue());
    }
}