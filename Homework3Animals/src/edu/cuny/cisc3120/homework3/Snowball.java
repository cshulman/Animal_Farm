package edu.cuny.cisc3120.homework3;

public class Snowball extends Pig{
	 Snowball() {
		//Snowball can only be eaten by Napoleon
		super(10);
	}
	 
	public void eat(Animal_Farm food){
	 	super.eat(food);
    	if(this.getSize() > (food.getSize()))
    		System.out.printf("%s is a superior pig so he can eat anything; even %s.\n", this.getName(), food.getName());		
    }
	    
    // All animals can speak.
	public void speak(){
	   	System.out.printf("%s says: The Seven Commandmants:\n", this.getName());
   }
}
