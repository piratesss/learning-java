package Random.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RockPaperScissorsConstants game = new RockPaperScissorsConstants();

        while (true) {

            String[] rockPaperScissor = game.MOVES;
            String computerMove = rockPaperScissor[new Random().nextInt(rockPaperScissor.length)];

            String playerMove;

            while (true) {
                game.returnNewLine("Please enter your move (r, p or s)");
                playerMove = scanner.nextLine().toLowerCase();
                if (playerMove.equals(game.ROCK) || playerMove.equals(game.PAPER) || playerMove.equals(game.SCISSORS)) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                game.returnNewLine("The game was a tie!");
            } else if (playerMove.equals(game.ROCK)) {
                if (computerMove.equals(game.PAPER)) {
                    game.returnNewLine("You lose!");

                } else if (computerMove.equals(game.SCISSORS)) {
                    game.returnNewLine("You win!");
                }
            }

            else if (playerMove.equals(game.PAPER)) {
                if (computerMove.equals(game.ROCK)) {
                    game.returnNewLine("You win!");

                } else if (computerMove.equals(game.SCISSORS)) {
                    game.returnNewLine("You lose!");
                }
            }

            else if (playerMove.equals(game.SCISSORS)) {
                if (computerMove.equals(game.PAPER)) {
                    game.returnNewLine("You win!");

                } else if (computerMove.equals(game.ROCK)) {
                    game.returnNewLine("You lose!");
                }
            }

            game.returnNewLine("Play again? (y/n)");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("y")) {
                break;
            }
        }

        scanner.close();

    }

}