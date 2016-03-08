package edu.cuny.cisc3120.homework3;

public abstract class Animal_Farm {
	 protected int size;
		public Animal_Farm(int size){
	        this.size = size;
	    }
		
		public int getSize() {
			return size;
		}
		
	    // All animals eat.
	    public void eat(Animal_Farm food){
			if(this.getName().equals(food.getName()))
	    		System.out.printf("Cannibalism is not permitted!!! %s will not eat him/herself.\n", this.getName());
	    }

	    // All animals can speak.
	    abstract public void speak();
	    
	    // I implemented this for you.  It returns the name of the class without the package.
	    public String getName()
	    {
	        // This implementation gives us the name of the class.

	        // This gets us a "Class" object which describes the class of "this".
	        java.lang.Class cls = this.getClass();
	        // This gets us the class name of "this".
	        String className = cls.getName();
	        // The class name has the package in it, so for example it is:
	        // edu.cuny/cisc3120.homework2.model.Iguana
	        //
	        // This code "splits" the string on the "." character into an array containing the segments that were seprated by the "."
	        String[] segments = className.split("\\.");

	        // Take the last segment, which is the name of this class.
	        String name = segments[segments.length - 1];
	        // Convert to lower case.
	        name = name.toLowerCase();

	        return name;
	    }


}
