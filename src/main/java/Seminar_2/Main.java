package Seminar_2;

public class Main {
    public static void main (String[] args) {
        Animal frog = new Frog();
        Animal capy = new Capybara();
    frog.voice();
    capy.voice();
    frog.getName();
    frog.setName("frog1");
    capy.setName("capy1");
        System.out.println(capy.getName());
        System.out.println(frog.getName());

        System.out.println();
        capy.feed();
        capy.clean();
        frog.feed();
        frog.clean();
        frog.info();
        capy.info();
    }
}
