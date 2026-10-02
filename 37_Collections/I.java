import java.util.ArrayList;

class I {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Mohan");
        list.add("Sohan");
        list.add("Ramesh");
        list.add("Krishna");
        list.add("Samee");

        System.out.println(list);
        System.out.println("---------------------");

        for(Object next : list)
            System.out.println(next + "^^^^^^^^^");

    }
}

// [Mohan, Sohan, Ramesh, Krishna, Samee]
// ---------------------
// Mohan^^^^^^^^^
// Sohan^^^^^^^^^
// Ramesh^^^^^^^^^
// Krishna^^^^^^^^^
// Samee^^^^^^^^^
