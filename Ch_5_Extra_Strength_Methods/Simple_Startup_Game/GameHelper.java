package Problems.Ch_5_Extra_Strength_Methods.Simple_Startup_Game;

import java.util.Scanner;

public class GameHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public int getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}
