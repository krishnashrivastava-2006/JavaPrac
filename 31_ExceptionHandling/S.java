import java.io.IOException;

class S {
    public static void main(String[] args) {
        System.out.println(" Step A");

        try {
            System.out.println("Step B");
            //if we create a catch block having checked exception type variable
            //then if no line of code in try block generates such exception
            //the compilation will fail

        } catch(IOException e) { //<= Error as IOException is never thrown in the corresponding try block
            System.out.println("Step C");
        }

        System.out.println(" Step D");

    }
}

// S.java:13: error: exception IOException is never thrown in body of corresponding try statement
//         } catch(IOException e) { //<= Error as IOException is never thrown in the corresponding try block
//           ^
// 1 error