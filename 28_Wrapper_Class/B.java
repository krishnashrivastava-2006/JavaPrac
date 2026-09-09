// Integer class -> valueOf(int) -> creates instance of Wrapper class
// in constant pool if the argument passed lies in the range of constant pool
// which is -128 --- 0 --- 127

class B {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(34);
        Integer b = Integer.valueOf(34);

        System.out.println(a == b); //true -> both variable points to same object in heap constant pool
    }
}