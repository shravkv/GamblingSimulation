public class GamblerBet {

    public static final int everyGameBet = 1;
    public static int everyDaystake = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation problem");
        int win, loose;
        int game = (int) (Math.random() * 2);
        if (game == 1) {
            everyDaystake += everyGameBet;
            System.out.println("Win the game :The the game :The amount is = " + everyDaystake);
        } else {
            everyDaystake -= everyGameBet;
            System.out.println("Loose the game :The amount is =" + everyDaystake);
        }
    }
}
