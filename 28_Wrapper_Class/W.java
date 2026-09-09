//This is exactly similar to the case with assignment operator
//the value we are returning must be in the respective range of the datatype
//otherwise error will be generated

class W {
    public static void main(String[] args) {
        Byte x = aaa();
        Short y = bbb();
        Character z = ccc();

        System.out.println(x); //127
        System.out.println(y); //32767
        System.out.println(z); //?
    }

    static Byte aaa() {
        return 127; //constant value only
    }

    static Short bbb() {
        return 32767; //constant value only
    }

    static Character ccc() {
        return 65535; //constant value only
    }
}