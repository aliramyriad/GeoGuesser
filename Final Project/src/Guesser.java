import java.util.ArrayList;
import java.util.Scanner;

public class Guesser // this class is used to start the game and create countries
{
    private int streak; // keeps count of the amount of correct guesses in a row
    private int highScore; // keeps count of the highest streak in that game session
    private String leader; // stores the current leader

    // creates countries
    Country Egypt = new Country
            ("Africa" , "Egypt" ,  109.3 ,
                    "The Pyramids of Giza are in this country.");
    Country Senegal = new Country
            ("Africa" , "Senegal", 16.88 ,
                    "Sadio Mane is from this country.");
    Country Morocco = new Country
            ("Africa" , "Morocco" , 37.08 ,
                    "This country beat Portugal in the FIFA World Cup.");
    Country US = new Country
            ("North America" , "United States" , 331.9 ,
                    "This country touches both the Pacific and Atlantic Ocean.");
    Country Canada = new Country
            ("North America" , "Canada" , 38.25 ,
                    "This country's flag has a maple leaf.");
    Country Mexico = new Country
            ("North America" , "Mexico" , 126.7 ,
                    "This country borders the US.");
    Country Switzerland = new Country
            ("Europe" , "Switzerland" , 8.7 ,
                    "This country's flag is a square.");
    Country Portugal = new Country
            ("Europe" , "Portugal" , 10.33 ,
                    "Cristiano Ronaldo is from this country.");
    Country Finland = new Country
            ("Europe" , "Finland" , 5.5 ,
                    "This country is located in the northern part of Europe.");
    Country Japan = new Country
            ("Asia" , "Japan" , 125.7 ,
                    "Kyoto is a city in this country.");
    Country Pakistan = new Country
            ("Asia" , "Pakistan" , 231.4 ,
                    "This country borders both India and Bangladesh.");
    Country Bangladesh = new Country
            ("Asia" , "Bangladesh" , 169.4 ,
                    "This country is home the the wordls most mangrove forest.");
    Country Argentina = new Country
            ("South America" , "Argentina" , 45.81 ,
                    "This country won the FIFA World Cup in 2022.");
    Country Brazil = new Country
            ("South America" , "Brazil" , 214.3 ,
                    "This country is known for its soccer.");
    Country Uruguay = new Country
            ("South America" , "Uruguay" , 3.42 ,
                    "This country is the biggest consumer of beef in the world.");

    Country Bhutan = new Country
            ("Asia" , "Bhutan" , 0.77 ,
                    "There are no traffic light in this country.");

    Country Iceland = new Country
            ("Europe" , "Iceland" , 0.372 ,
                    "This country has the cheapest energy cost per capita.");

    Country newZealand = new Country
            ("Oceania" , "New Zealand" , 5.12 ,
                    "There are five sheep for every resident in this country.");

    Country Ghana = new Country
            ("Africa" , "Ghana" , 32.83 ,
                    "Abedi Pele used to play for this country's national football team.");
    Country saudiArabia = new Country("Asia" , "Saudi Arabia" , 35.95 ,
            "Mecca and Madina are located in this country.");

    Country Albania = new Country("Europe" , "Albania" , 2.7 ,
            "This country has more than 700 thousand bunkers. These bunkers were in use from 1967 - 1991.");

    Country equatorialGuinea = new Country("Africa" , "Equatorial Guinea" , 1.63 ,
            "This country is the only African nation to have Spanish as an official language." );

    // Creates a list of all countries
    Country[] listOfCountries = new Country[]{Egypt , Senegal , Morocco , US , Canada ,
            Mexico , Switzerland , Portugal , Finland , Japan , Pakistan , Bangladesh , Argentina,
            Brazil, Uruguay , Bhutan , Iceland , newZealand , Ghana , saudiArabia , Albania , equatorialGuinea};

    // Creates a list of African countries
    Country[] africanCountries = new Country[]{Egypt , Senegal , Morocco , Ghana , equatorialGuinea};

    // Creates a list of South American countries
    Country[] southAmericanCountries = new Country[]{Argentina , Brazil , Uruguay};

    // Creates a list of North American countries
    Country[] northAmericanCountries = new Country[]{US, Canada , Mexico};

    // Creates a list of European countries
    Country[] europeanCountries = new Country[] {Switzerland , Portugal , Finland , Iceland , Albania};

    // Creates a list of Asian countries
    Country[] asianCountries = new Country[] {Japan , Pakistan , Bangladesh , Bhutan , saudiArabia};

    public boolean correctGuess(Country c , String s) //returns true if the country's name matches the given string
    {
        return c.getName().equalsIgnoreCase(s);
    }

    public int getStreak() // returns the streak
    {
        return streak;
    }
    public int getHighScore() // returns the high score
    {
        return highScore;
    }
    public String getLeader()
    {
        return leader;
    }
    public void setLeader(String s)
    {
        leader = s;
    }
    public void setHighScore(int h)
    {
        highScore = h;
    }

    public void play() // starts the game
    {
        Scanner input = new Scanner(System.in); // gets the input from the keyboard
        System.out.println("You choose a specific continent or say 'all' for all countries");
        String answer = input.nextLine(); // takes the input and stores it in a string
        int random = 0;
        Country game = null;

        if(answer.equalsIgnoreCase("all"))
        {
            random =  (int) (Math.random() * listOfCountries.length - 1);
            game = listOfCountries[random];
        }

        else if(answer.equalsIgnoreCase("africa"))
        {
            random = (int) (Math.random() * africanCountries.length - 1);
            game = africanCountries[random];
        }
        else if(answer.equalsIgnoreCase("south america"))
        {
            random = (int) (Math.random() * southAmericanCountries.length - 1);
            game = southAmericanCountries[random];
        }
        else if(answer.equalsIgnoreCase("north america"))
        {
            random = (int) (Math.random() * northAmericanCountries.length - 1);
            game = northAmericanCountries[random];
        }
        else if(answer.equalsIgnoreCase("europe"))
        {
            random = (int) (Math.random() * asianCountries.length - 1);
            game = europeanCountries[random];
        }


        System.out.println("Guess a country: ");


        for(int i = 0 ; i <= 3 ; i++)
        {
            if (correctGuess(game , answer))
            {
                System.out.println();
                System.out.println( "Correct!");
                System.out.println(); // to put gaps
                System.out.println(game.toString()); // prints the information of that country
                streak++;

                if(streak > highScore) //changes the high score to the longest streak
                {
                    highScore = streak;
                }

                break;
            }

            else if(i == 1)
            {
                System.out.println();
                System.out.println("That is incorrect, here's a hint:");
                System.out.println(game.getFunFact());
                System.out.println(); // to put gaps
                System.out.println("Attempts left: 2"); // lets the user know the amount of attempts left
                System.out.println("What is your next guess?");
                answer = input.nextLine();

            }
            else if(i == 2)
            {
                System.out.println();
                System.out.println("That is incorrect, here's a hint:");
                System.out.println( "This country is located in " + game.getContinent() + ".");
                System.out.println(); // to put gaps
                System.out.println("Attempts left: 1"); // lets the user know the amount of attempts left
                System.out.println("What is your next guess?");
                answer = input.nextLine();
            }
            else if (i == 3)
            {
                System.out.println("Maybe next time,");
                System.out.println( "The country was " + game.getName());
                System.out.println(game.toString()); // prints the information of that country
                streak = 0;
            }
        }
    }
}
