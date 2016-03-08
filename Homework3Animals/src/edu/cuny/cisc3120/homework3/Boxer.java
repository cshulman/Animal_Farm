package edu.cuny.cisc3120.homework3;

public class Boxer extends Horse {
	Boxer() {
		//Old_Major is the smallest of the pigs. All other pigs will eat him.
		super(5);
	}
	public void eat(Animal_Farm food)
	    {
	    	super.eat(food);
	    	if(this.getSize() > (food.getSize()))
	    		System.out.printf("%s is a gentle horse. But, he will eat %s.\n", this.getName(), food.getName());		
	    }
	    
	    // All animals can speak.
	    public void speak()
	    {
	    	System.out.printf("%s chants: Four legs good, Two legs bad.\n", this.getName());
	    }
}
