package edu.cuny.cisc3120.homework3;

public class Mollie extends Horse {
	Mollie() {
		//Old_Major is the smallest of the pigs. All other pigs will eat him.
		super(4);
	}
	public void eat(Animal_Farm food)
	    {
	    	super.eat(food);
	    	if(this.getSize() > (food.getSize()))
	    		System.out.printf("%s is to vain. She will only eat sugar cubes.\n", this.getName());		
	    }
	    
	    // All animals can speak.
	    public void speak()
	    {
	    	System.out.printf("%s demands: I want sugar! I want bows!.\n", this.getName());
	    }
}
