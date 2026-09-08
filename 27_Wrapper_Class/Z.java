class Z {
    public static void main(String[] args) {
        Float f = Float.valueOf(73); // OK No error -> as it is widening conversion int to float

        Double d = Double.valueOf(28); //OK No error -> as it is widening conversion int to double

        System.out.println(f);
        System.out.println(d);
    }

// 73.0
// 28.0
}