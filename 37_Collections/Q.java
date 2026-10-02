//Duplicate records are allowed
import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list);

        list.add("Krishna");
        list.add("Ajay");
        list.add("Kiran");
        list.add("Krishna");
        list.add("Shubham");
        list.add("Tanu");
        list.add("Ajay");

        System.out.println(list);

        String str = "Ajay";
        boolean flag = list.remove(str); //it will remove only the first occurence of the specified object not all

        System.out.println(flag);
        System.out.println(list);
    }
}

// []
// [Krishna, Ajay, Kiran, Krishna, Shubham, Tanu, Ajay]
// true
// [Krishna, Kiran, Krishna, Shubham, Tanu, Ajay]