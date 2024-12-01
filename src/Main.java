public class Main {
    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog", 5, "Meat", 15, "Brown");
        Bird eagle = new Bird("Eagle", 10, 20, true);

        Mammal.printMammalInfo();

        dog.howOldisAnimal();
        eagle.howOldisAnimal();

        dog.feed("Meat");
        dog.feed("Seeds");
        eagle.feed("Meat");
        eagle.feed("Seeds");


        eagle.play(20);


        eagle.fly();

        eagle.singSong(3);
        dog.run();

    }
}