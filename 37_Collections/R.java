import java.util.ArrayList;

class R {
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


        System.out.println(list);
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        while(list.contains("Ragunath")) {
            System.out.println("=============================================================");
            list.remove("Ragunath");
            System.out.println(list);
        }
    }
}

// [Ragunath, Krishna, Ajay, Ragunath, Karan, Ragunath, Lokesh, Narayan, Chetan, Ragunath, Ragunath, Tanu]
// ----------------------------------------------------------------------------------------------------------------
// =============================================================
// [Krishna, Ajay, Ragunath, Karan, Ragunath, Lokesh, Narayan, Chetan, Ragunath, Ragunath, Tanu]
// =============================================================
// [Krishna, Ajay, Karan, Ragunath, Lokesh, Narayan, Chetan, Ragunath, Ragunath, Tanu]
// =============================================================
// [Krishna, Ajay, Karan, Lokesh, Narayan, Chetan, Ragunath, Ragunath, Tanu]
// =============================================================
// [Krishna, Ajay, Karan, Lokesh, Narayan, Chetan, Ragunath, Tanu]
// =============================================================
// [Krishna, Ajay, Karan, Lokesh, Narayan, Chetan, Tanu]