package edu.cuny.cisc3120.homework3;

class Homework {
    static public void main(String[] args) {
    	System.out.println("WELCOME TO ANIMAL FARM");
        Animal_Farm[] animals = {
        	new Old_Major(), new Snowball(), new Napoleon(), new Boxer(), new Mollie()
            // TODO:  Add your new mammals here.
        };

        // Check that all the animals can speak!
        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }

        // Check every combination of animals eating each other (And themselves!)
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals.length; j++) {
                animals[i].eat(animals[j]);
            }
        }
    }
}
