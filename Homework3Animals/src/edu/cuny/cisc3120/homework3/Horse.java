package edu.cuny.cisc3120.homework3;

public abstract class Horse extends Animal_Farm {
	
	Horse(int i){
        super(i);
    }
	
    public void eat(Animal_Farm food)
    {
    	super.eat(food);
    	if(this.getSize() < (food.getSize())){
    		System.out.printf("%s is to inferior and cannot eat %s.\n", this.getName(), food.getName());
    		return;
    	}
    }

    // All animals can speak.
    public void speak()
    {
    	System.out.printf("%s says: NEIGH!!", this.getName());
    }

}
