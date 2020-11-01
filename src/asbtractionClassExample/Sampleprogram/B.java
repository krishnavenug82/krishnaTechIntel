package asbtractionClassExample.Sampleprogram;

public abstract class B extends A{
	

    void firstMethod()
    {
        System.out.println("FIRST");
         
        thirdMethod();
    }
     
    abstract void thirdMethod();
}
