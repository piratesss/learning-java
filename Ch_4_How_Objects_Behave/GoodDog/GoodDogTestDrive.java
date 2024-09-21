package Ch_4_How_Objects_Behave.GoodDog;

class GoodDogTestDrive {

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(60);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog One: " + one.getSize());
        System.out.println("Dog Two: " + two.getSize());

        one.bark();
        two.bark();
    }
}
