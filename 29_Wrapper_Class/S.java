class S {
    public static void main(String[] args) {
        Integer x = 37;

        String s1 = x.toString();

        System.out.println(s1);

        int y = 37;

        String s2 = y.toString(); //error: int can not be dereferenced

        System.out.println(s2);
    }
}
// S.java:11: error: int cannot be dereferenced
//         String s2 = y.toString(); //error: int can not be dereferenced
//                      ^
// 1 error