class C {
    public static void main(String[] args) {
        //Boxing then Conversion is allowed 
        //but not conversion then boxing still there are some exceptional cases

        Object a = 478; //Autoboxing -> Integer object -> conversion
        Object b = false; //Autoboxing -> Boolean object -> conversion
        Object c = 'A'; //Autoboxing -> Character object -> conversion

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}