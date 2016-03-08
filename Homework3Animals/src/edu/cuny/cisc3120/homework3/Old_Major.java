package edu.cuny.cisc3120.homework3;

public class Old_Major extends Pig{
	
	 Old_Major() {
		//Old_Major is the smallest of the pigs. All other pigs will eat him.
		super(9);
	}

	public void eat(Animal_Farm food)
	    {
	    	super.eat(food);
	    	if(this.getSize() > (food.getSize()))
	    		System.out.printf("%s is a superior pig so he can eat anything; even %s.\n", this.getName(), food.getName());		
	    }
	    
	    // All animals can speak.
	    public void speak()
	    {
	    	System.out.printf("%s sings: 🎶Beasts of England, Beasts of Ireland 🎶\n", this.getName());
	    }
}
