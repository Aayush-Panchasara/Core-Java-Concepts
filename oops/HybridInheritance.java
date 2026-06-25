package oops;
/*Program to demonstrate Hybrid Inheritance */

class Animal {
    public void bark() {
        System.out.println("Animal barking...");
    }
}

class LandAnimal extends Animal {
    public void livingLocation() {
        System.out.println("I am living on the Land.");
    }
}

class AquaticAnimal extends Animal {
    public void livingLocation() {
        System.out.println("I am living in the water.");
    }
}

class Dog extends LandAnimal {
    @Override
    public void bark() {
        System.out.println("Bhav bhav !!!!!");
    }

    public void animalType() {
        System.out.println("I am a land animal");
    }
}

class Fish extends AquaticAnimal {
    @Override
    public void bark() {
        System.out.println("Fish Barking...");
    }

    public void animalType() {
        System.out.println("I am a aquatic animal");
    }
}

public class HybridInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.livingLocation();
        dog.animalType();

        Fish fish = new Fish();
        fish.bark();
        fish.livingLocation();
        fish.livingLocation();
    }

}
