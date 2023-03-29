public class Main {
    public static void main(String[] args) throws Exception {
        Cannibal c=new PhilosophyCannibal();
        c.schedule();
        System.out.println("\n");
        c=new SimpleCannibal();
        c.schedule();

    }
}
