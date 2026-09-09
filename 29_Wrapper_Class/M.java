//To convert String to primitive
//static method :-
//parseBoolean(String) -> Boolean
//parseByte(String)    -> Byte
//parseShort(String)   -> Short
//parseInt(String)     -> Integer
//parseLong(String)    -> Long
//parseFloat(String)   -> Float
//parseDouble(String)  -> Double

class M {
    public static void main(String[] args) {
        // int a = "67802"; M.java:3: error: incompatible types: String cannot be converted to int
        int a = Integer.parseInt("67467");
        //String to int

        System.out.println(a); //67467
    }
}