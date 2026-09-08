//Integer class 
//valueOf(int) -> static method

class G {
    public static void main(String[] args) {
        Integer a = new Integer(367); //deprecated warning will come

        Integer b = Integer.valueOf(277);

        System.out.println(a);
        System.out.println(b);
    }
}