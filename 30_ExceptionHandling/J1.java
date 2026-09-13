class J1 {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            Integer x = Integer.valueOf(args[0]);
            System.out.println(x);
        } catch(Exception e) {  //<= catch-all block (unreliable code)
            System.out.println("Problem Solved");
            System.out.println(e);
        }

        System.out.println("End");
    }
}