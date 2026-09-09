class G {
    public static void main(String[] args) {
        Integer x = 76;

        //AutoBoxing
        pro(x); // Unboxing: Integer object -> int (primitive)
    }

    static void pro(int x) {
        System.out.println(x);
    }
}