package designapattern.templateDsignPattern;

public class CricketGame extends Game{
    @Override
    void initialize() {

        System.out.println("Cricket Game Initialized");

    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Ended");

    }
}
