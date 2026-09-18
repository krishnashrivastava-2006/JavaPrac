class J {
    public static void main(String[] args) {
        try {
            Class.forName("A");
        // } catch(Error e) { //error
            
        // }

        // } catch(Exception e) { //No error

        // }

        // } catch(Throwable e) { //No error

        // }

        // } catch(ClassNotFoundException e) { //No error

        // }

        } catch(YourException e) { //Error
        //class which is Throwable, is only catchable
        }

    }
}
// J.java:21: error: incompatible types: YourException cannot be converted to Throwable
//         } catch(YourException e) { //Error
//                 ^
// 1 error

class YourException /*extends Exception*/ {

}