# Country Guessing Game

This project is a command-line-based country guessing game written in Java. The game provides a fun and educational way to learn about different countries, their populations, continents, and interesting facts. Players can guess countries from a specific continent or from a global pool, with hints provided for incorrect guesses.

## Features
- Supports guessing countries globally or by continent.
- Provides hints, including fun facts and the continent of the country.
- Tracks and displays:
  - Current streak of correct guesses.
  - High score (longest streak in a session).
  - Leader (player with the highest streak).

## How to Play
1. **Start the Game**:
   - Run the `Main` class.
   - Enter your name when prompted.
2. **Select Continent**:
   - Choose a continent (e.g., "Africa", "Europe", "Asia") or type "all" for a global challenge.
3. **Guess the Country**:
   - You have up to 3 attempts to guess the country correctly.
   - After the first incorrect guess, a fun fact is provided as a hint.
   - After the second incorrect guess, the continent of the country is revealed.
4. **Game Over**:
   - If you fail to guess correctly after three attempts, the correct answer is displayed.
   - The game can be restarted by typing "yes" when prompted.

## Files Overview
1. **Country.java**:
   - Defines the `Country` class with attributes like continent, name, population, and a fun fact.
   - Provides methods to retrieve these attributes and a `toString()` method for displaying country details.

2. **Guesser.java**:
   - Manages the game logic, including:
     - Country initialization and categorization.
     - Tracking and updating streaks, high scores, and the leader.
     - Handling user inputs and providing hints during the game.

3. **Main.java**:
   - Entry point of the application.
   - Handles user interaction, initializes the game, and displays game stats like leader and high score.

## How to Compile and Run
1. Open a terminal/command prompt.
2. Navigate to the directory containing the `.java` files.
3. Compile the files using:
   ```bash
   javac Country.java Guesser.java Main.java
