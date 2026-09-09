class H {
    public static void main(String[] args) {
        // char a = 128; //outside constant pool range -> false
        char a = 127; // lies in the range of constant pool -> true

        //constant pool range for Character : 0 --- 127
        // as char cannot have negative range
        // char: 0 --- 65535

        Character x = Character.valueOf(a);
        Character y = Character.valueOf(a); 

        System.out.println(x == y);
    }
}