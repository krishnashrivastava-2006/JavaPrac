import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Ragunath");
        list.add("Krishna");
        list.add("Ajay");
        list.add("Ragunath");
        list.add("Karan");
        list.add("Ragunath");
        list.add("Lokesh");
        list.add("Narayan");
        list.add("Chetan");
        list.add("Ragunath");
        list.add("Ragunath");
        list.add("Tanu");


        System.out.println(list); // [Ragunath, Krishna, Ajay, Ragunath, Karan, Ragunath, Lokesh, Narayan, Chetan, Ragunath, Ragunath, Tanu]

        
        list.clear();

        System.out.println(list); // []
    }
}

