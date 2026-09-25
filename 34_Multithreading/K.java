class K {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        // x.setName("ramu");

        System.out.println(x.getName() + " - " + x.getId() + " - " + x.getPriority() + " - " + x.isAlive());
    }
}
// main - 1 - 5 - true