class X {
    public static void main(String[] args) {
        Student s = new Student();

        String x = s.toString();

        System.out.println(s); //Student@36baf30c
        System.out.println(x); //Student@36baf30c 

        int hashCode = s.hashCode();
        System.out.println(hashCode); //918221580

        String ans  = Integer.toHexString(hashCode);
        System.out.println(ans); //36baf30c

        // System.out.println(s.getClass());

        System.out.println(x + " = " + ans); //Student@36baf30c =  36baf30c
    }
}