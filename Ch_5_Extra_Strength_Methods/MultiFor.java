package Problems.Ch_5_Extra_Strength_Methods;

public class MultiFor {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            for (int j = 4; j > 2; j--) {
                System.out.println(i + " " + j);
            }

            if (i == 1) {
                i += 1;
            }
        }

    }
}
