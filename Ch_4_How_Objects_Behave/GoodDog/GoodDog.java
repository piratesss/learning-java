package Ch_4_How_Objects_Behave.GoodDog;

class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int dogSize) {
        size = dogSize;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
