// i/p: <no-arg>, ram, 3, 2, 1, 0

class N {
    public static void main(String[] args) {
        System.out.println(" ------ start --- ");

        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("---- step A");
            
            int[] x = {2,3,0};
            int t = x[i];
            System.out.println("---- step B");
            
            int y = 12 / t;
            System.out.println("---- step C");
        } catch(ArithmeticException|ArrayIndexOutOfBoundsException e) { 
            System.out.println("Same Solution Code ... ");
            System.out.println(e);
        } catch(NumberFormatException e) {
            System.out.println("Solution For NFE");
            System.out.println(e);
        } 

        System.out.println(" ------ end --- ");
    }    
}