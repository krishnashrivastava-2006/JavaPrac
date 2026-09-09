class G {
    public static void main(String[] args) {
        Long x = Long.valueOf(128);
        Long y = Long.valueOf(128);

        System.out.println(x == y); //false as 128 is out of pool range
    }
}