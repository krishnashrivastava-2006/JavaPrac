class L {
    public static void main(String[] args) {
        Integer a = 7; //Boxing
        System.out.println(a);

        a++; // unboxing and increment and boxing

        System.out.println(a);
    }
}

//Wrapper class objects are immutable so a new object after increment is created
// and assigned to a

//normally objects cannot be incremented or decremented
//but wrapper class objects can because of the concept of AutoBoxing