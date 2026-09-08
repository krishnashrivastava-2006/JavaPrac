// Character class
// valueOf(char) -> static method

class F {
    public static void main(String[] args) {
        Character c1 = new Character('a'); //deprecated

        Character c2 = Character.valueOf('z');

        System.out.println(c1);
        System.out.println(c2);
    }
}