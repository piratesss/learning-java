package Ch_3_Variables.Dog;

class Dog {

    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bruno";

        // now dog array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // accesing the dog
        myDogs[0].name = "Dog 1";
        myDogs[1].name = "Dog 2";

        // dog 2 name
        System.err.println("last dogs name is");
        System.err.println(myDogs[2].name);

        // loop through the Dog array

        int x = 0;

        while (x < myDogs.length) {
            myDogs[x].bark();
            x += 1;
        }

    }

    public void bark() {
        System.out.println(name + " says woof woof");
    }

    public void eats() {
        System.out.println(name + " eats treat.");
    }

    public void chaseCat() {
        System.out.println(name + " chased a cat.");
    }

}
