package Ch_3_Variables.TestArrays;

public class TestArrays {

    public static void main(String[] args) {
        int ref;
        int y = 0;

        int[] index = new int[4];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];

        islands[0] = "Bermuda"; // 3
        islands[1] = "Fiji"; // 1
        islands[2] = "Azores"; // 4
        islands[3] = "Cozumel"; // 2

        while (y < 4) {

            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;

        }

    }

}
