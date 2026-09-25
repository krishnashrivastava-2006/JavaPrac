class L {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x.getName() + " - " + x.getId() + " - " + x.getPriority() + " - " + x.isAlive());

        x.setName("Bholu");
        x.setPriority(7);
        // x.setId() error

        System.out.println(x.getName() + " - " + x.getId() + " - " + x.getPriority() + " - " + x.isAlive());
    }
}
// main - 1 - 5 - true
// Bholu - 1 - 7 - true