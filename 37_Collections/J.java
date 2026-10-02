import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Krishna");
        list.add("Aastha");
        list.add("Ananaya");
        list.add("Chetan");
        list.add("Madhur");
        list.add("Ujjwal");

        System.out.println(list);
        System.out.println("--------------------------");

        for(String next : list)
            System.out.println(next + "????");

    }
}

// [Krishna, Aastha, Ananaya, Chetan, Madhur, Ujjwal]
// --------------------------
// Krishna????
// Aastha????
// Ananaya????
// Chetan????
// Madhur????
// Ujjwal????