class P1 {
    public static void main(String[] args) {
        float a = 56; // widening conversion

        Float b = 56.0f; //autoboxing

        // Float c = 56; -> error
        Float c = (float)56; //Type casting

        Float d = a; //Autoboxing
    }
}