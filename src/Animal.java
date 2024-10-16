abstract class Animal{
    public int age;
    private int maxAge;
    private String name;
    protected static String diet;



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void howOldisAnimal(){
        if (age > 0.5*maxAge){
            System.out.println("It's old animal");
        }
        else {
            System.out.println("It's young animal");
        }
    }
}