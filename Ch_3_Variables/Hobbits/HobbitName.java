package Ch_3_Variables.Hobbits;

public class HobbitName {
    public static void main(String[] args) {

        Hobbit[] newHobbit = new Hobbit[3];
        int z = -1;

        while (z < 2) {
            z += 1;

            newHobbit[z] = new Hobbit();

            newHobbit[z].name = "Bilbo";

            if (z == 1) {
                newHobbit[z].name = "Frodo";
            }
            if (z == 2) {
                newHobbit[z].name = "Sam";
            }

            System.err.print(newHobbit[z].name + " is a ");
            System.err.println("good hobbit name.");

        }
    }

}
