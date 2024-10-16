class Mammal extends Animal implements Feedable {
    private String furColor;

    public Mammal(String name, int age, String diet, int maxAge, String furColor) {
        this.setName(name);
        this.age = age;
        Animal.diet = diet;
        this.setMaxAge(maxAge);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void run() {
        System.out.println(getName() + " is running");
    }

    public static void printMammalInfo() {
        System.out.println("Mammals are warm-blooded vertebrates that have hair or fur.");
    }

    @Override
    public void howOldisAnimal() {
        if (age > 0.6 * getMaxAge()) {
            System.out.println(getName() + " is old mammal");
        } else {
            System.out.println(getName() + " is young mammal");
        }
    }
    @Override
    public void feed(String food) {
        if (food.equals(diet)) {
            System.out.println(getName() + " is eating " + food + " and is happy!");
        } else {
            System.out.println(getName() + " is not happy with " + food + ". It prefers " +diet);
        }
    }

}