package designapattern.templateDsignPattern;



// behavrial designa pattern
public class GameTemplate {
    public static void main(String[] args) {
        Game fooybalGame = new FootBallGame();
        fooybalGame.play();
        System.out.println("----------------");
        Game cricketGame = new CricketGame();
        cricketGame.play();
    }
}
