class P2 {
    public static void main(String[] args) {

    }

    static int pro() {
        return 300; //Unconditionally, so if we try to write any line of code after it error will occur as it will be unreachable statement

        return 600; //Error
    }
}
// P2.java:9: error: unreachable statement
//         return 600; //Error
//         ^
// 1 error