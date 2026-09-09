//exception cases with Byte Short and Character class
//Conversioon then Boxing is legal

class E {
    public static void main(String[] args) {
        Byte a = 25; // conversion: int -> byte -> Boxing
        Byte b = 'a'; // conversion: char -> byte -> Boxing

        System.out.println(a);
        System.out.println(b);
    }
}