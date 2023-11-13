package Seminar_2;

public class Capybara extends  Animal{

    @Override
    public void feed() {
        System.out.println("capybara has been feeded");
    }

    @Override
    public void clean() {
        System.out.println("capybara has been cleaned");
    }

    @Override
    void voice() {
        System.out.println("capybara noises");
    }

    @Override
    public void info() {
        System.out.println("i caaapyyybara");
    }
}
