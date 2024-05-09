package Lesson8;

public class ToysMain {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addToy("Taddy", "bear");
        toyStore.addToy("Barbie", "doll");
        toyStore.addToy("Rikky", "fox");

        toyStore.printPairs();
        toyStore.printProductNames();
        toyStore.printProductValues();
    }
}


