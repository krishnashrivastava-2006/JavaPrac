//wrapper class objects created through AutoBoxing will be created in constant pool
//if lies in the range of pool
// i.e. -128 --- 0 --- 127

class M {
    public static void main(String[] args) {
        Integer x = 65; //Boxing
        Integer y = 65; //Boxing

        System.out.println(x == y); //true
    }
}