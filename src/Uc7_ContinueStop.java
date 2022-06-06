public class Uc7_ContinueStop {
    public static final int everyGameBet = 1;
    public static int everyDayStake = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambler simulation program");
        int day, maxMonthly = 0, minMonthly = 0, large = 0, small = 0;
        for (day = 1; day <= 30; day++) {
            while (true) {
                for (int i = 0; i < 100; i++) {
                    int game = (int) (Math.random() * 2);
                    if (game == 1) {
                        everyDayStake += everyGameBet;
                    } else {
                        everyDayStake -= everyGameBet;
                    }
                }
                if (everyDayStake >= 150) {
                    System.out.println("Win 50% :So resign the day");
                    System.out.println(" Day" + day + " :remaining amount is " + everyDayStake);
                    maxMonthly += everyDayStake;
                    if (everyDayStake > large)
                        large = everyDayStake;
                    break;
                }
                if (everyDayStake == 50) {
                    System.out.println("Loose 50% :So resign the day");
                    System.out.println(" Day" + day + " :remaining amount is " + everyDayStake);
                    minMonthly += everyDayStake;
                    small = everyDayStake;
                    break;
                }
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Luckiest winning amount is :" + large);
        System.out.println("Unluckiest winning amount is :" + small);
        System.out.println("--------------------------------------");
        System.out.println("Total monthly winning amount is :" + maxMonthly);
        System.out.println("Total monthly loosing amount is :" + minMonthly);
        System.out.println("--------------------------------------");
        if (maxMonthly > minMonthly) {
            System.out.println("Gambling continue next month ");
        } else {
            System.out.println("Stop gambling");
        }
    }
}
