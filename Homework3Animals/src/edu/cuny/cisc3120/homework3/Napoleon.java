package edu.cuny.cisc3120.homework3;

public class Napoleon extends Pig{
	
	Napoleon() {
		//No one can eat Napoleon
		super(15);
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
	    	System.out.printf("%s chants: Four legs good, Two legs BETTER\n", this.getName());
	    }
}
