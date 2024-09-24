package Problems.Ch_5_Extra_Strength_Methods.Simple_Startup_Game;

/**
 * SimpleStartup
 */
public class SimpleStartup {

    int[] locationCells;
    int numOfHits = 0;

    String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits += 1;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println("result: " + result);
        return result;
    }

    void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}