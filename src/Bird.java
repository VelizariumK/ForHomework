class Bird extends Animal implements Feedable, Playable {
    private boolean canFly;

    public Bird(String name, int age, int maxAge, boolean canFly) {
        this.setName(name);
        this.age = age;
        Animal.diet = "Seeds";
        this.setMaxAge(maxAge);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void fly() {
        if (canFly) {
            System.out.println(getName() + " is flying");
        } else {
            System.out.println(getName() + " cannot fly");
        }
    }

    @Override
    public void howOldisAnimal() {
        if (age > 0.75 * getMaxAge()) {
            System.out.println(getName() + " is old bird");
        } else {
            System.out.println(getName() + " is young bird");
        }
    }

    public void singSong(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(getName() + " sings: Tweet-tweet!");
        }
    }
    @Override
    public void feed(String food) {
        if (food.equals(diet)) {
            System.out.println(getName() + " is eating " + food + " and is happy!");
        } else {
            System.out.println(getName() + " is not happy with " + food + ". It prefers " + diet);
        }
    }
    @Override
    public void play(int duration) {
        int energyLevel = 100;
        for (int i = 0; i < duration; i++) {
            if (energyLevel > 0) {
                System.out.println(getName() + " is playing ");
                energyLevel -= 10;
            } else {
                System.out.println(getName() + " is too tired to play anymore!");
                break;
            }
        }
    }
}
