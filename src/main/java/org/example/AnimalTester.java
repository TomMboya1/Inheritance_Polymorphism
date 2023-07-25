package org.example;

public class AnimalTester {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion");

        // Calling the two versions of the animalSound() method
        System.out.println("Using animalSound() with no parameters:");
        lion.animalSound();

        System.out.println("\nUsing animalSound() with intensity parameter:");
        lion.animalSound("high");
        lion.animalSound("low");
        lion.animalSound("medium");

    }
}
