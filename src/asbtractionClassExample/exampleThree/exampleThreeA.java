package asbtractionClassExample.exampleThree;

public abstract class exampleThreeA {
	
	abstract int firstMethod(int i);
    
    abstract int secondMethod(int i);
     
    int thirdMethod(int i)
    {
        return secondMethod(++i);
    }

}
