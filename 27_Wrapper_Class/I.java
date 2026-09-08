//Float class
//valueOf(float) -> static method

class I {
    public static void main(String[] args) {
        Float a = new Float(28.5f); //deprecated (constructor)

        Float b = Float.valueOf(368.29f);

        System.out.println(a);
        System.out.println(b);

    }
}