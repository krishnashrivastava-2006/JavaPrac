class O1 {
    public static void main(String[] args) {
        double x = 3.5f; //Ok

        // Double y = 3.5f; //error
        Double y = 3.5; //autoboxing

        System.out.println(x == y); //true -> value is compared not reference as one operand is primitive
        
    }
}