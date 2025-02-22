class Animal {
    public int age;
    public String gender;

    public boolean isMammal() {
        System.out.println("Checking if the animal is a mammal.");
        return false;
    }

    public void mate() {
        System.out.println("The animal is mating.");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.age = 5;
        myAnimal.gender = "Male";
        
        Fish myFish = new Fish();
        
        Zebra myZebra = new Zebra();
        myZebra.is_wild = true;
        
        // Calling all public methods from Animal and Zebra class
        myAnimal.isMammal();
        myAnimal.mate();
        
        myZebra.isMammal();
        myZebra.mate();
        myZebra.run();
    }
}

class Fish extends Animal {
    private int sizeInFeet;

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish.");
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        System.out.println("The zebra is running.");
    }
}
