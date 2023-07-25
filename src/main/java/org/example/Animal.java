package org.example;

public class Animal {

        private String animalName;

        // Constructor
        public Animal(String animalName) {
            this.animalName = animalName;
        }

        // Method overloading for animalSound()
        public void animalSound() {
            System.out.println("Roarr!");
        }

        public void animalSound(String intensity) {
            if (intensity.equalsIgnoreCase("high")) {
                System.out.println("Roarrrrrrrr!");
            } else if (intensity.equalsIgnoreCase("low")) {
                System.out.println("Roar!");
            } else {
                System.out.println("Cannot reproduce the sound properly.");
            }
        }
    }

