public class GamblerAmount {
    public static final int everyGameBet = 1;
    public static int everyDayStake = 100;

     public  static void main(String[] args) {
         System.out.println("Welcome to Gambler Simulation program");
         int day;
         for (day = 1; day <= 20; day++) {
             while (true) {
                 for (int i = 0; i < 100;i++) {

                     int game = (int) (Math.random() * 2);
                     if (game == 1) {
                         everyDayStake += everyGameBet;
                     } else {
                         everyDayStake -= everyGameBet;
                     }
                 }
         if (everyDayStake >= 150) {
             System.out.println("Win 50% :So resign the day");
             System.out.println("Day"+ day+" :remaining amount is "+everyDayStake);
             break;
         }
         if (everyDayStake == 50) {
             System.out.println("Loose 50% :So resign the day");
             System.out.println("Day" + day + " :remaining amount is " + everyDayStake);
             break;
             }
         }
     }
   }
}

