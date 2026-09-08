//Integer class
//valueOf(String,int) -> int represents radix or base of number passed in  String

class M {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("111",10);
        Integer b = Integer.valueOf("111",2);
        Integer c = Integer.valueOf("111",8);
        Integer d = Integer.valueOf("111",16);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        
    }
}


// 111
// 7
// 73
// 273