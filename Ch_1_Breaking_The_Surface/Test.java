package Ch_1_Breaking_The_Surface;

class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {

            // y = x - y; // 00 11 21 32 42
            System.out.print(x + "" + y + " ");
            x = x + 1;

        }
    }

}
