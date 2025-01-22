import java.util.Scanner;
public class Main // class which calls the methods
{
    public static void main(String[] args)
    {
        System.out.println("Whats your name?");
        Scanner input = new Scanner(System.in);
        Guesser game = new Guesser();
        String name = input.nextLine();
        int gamesPlayed = 0; // stores count of the amount of games played
        do {
            gamesPlayed++;
            if(gamesPlayed > 1) // prints out a bunch of lines, so it looks like the screen was cleared
            {
                for(int x = 0; x < 30 ; x++)
                {
                    System.out.println();
                }
            }
            if(game.getLeader() != null) // if statement so that the 'leader' display doesn't say "null"
            {
                System.out.println("Leader: " + game.getLeader());
            }
            else
            {
                System.out.println("Leader: N/A");
            }
            System.out.println("High Score: " + game.getHighScore()); // displays the high score
            System.out.println("Active Streak: " + game.getStreak()); //displays the streak
            System.out.println(); // makes a gap between lines
            game.play(); //starts the game
            if(game.getHighScore() == game.getStreak() && game.getStreak() != 0) // sets the leader to the active user if the streak is higher than the high score
            {
                game.setLeader(name);
            }
            System.out.println("Say 'yes' if you would like to play again");
            System.out.println();// to make a gap
        } while(input.nextLine().equalsIgnoreCase("yes"));


    }
}
