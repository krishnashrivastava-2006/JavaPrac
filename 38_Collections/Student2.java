class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name  + " - " + age;
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Student2)obj).name) && this.age == ((Student2)obj).age;
    }
}