//Exceptional case in Type conversion
// wrapper classes for smaller data types than int like byte , short and char
//if we assingn a constant value in range of respective types
// with assignment operator
// then type casting is exempted
// even though it is narrowing conversion

class Q {
    public static void main(String[] args) {
        Byte a = 25;
        Short b = 789;
        Character c = 65384;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}