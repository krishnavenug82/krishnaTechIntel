package passByValueAndReference.exampleTwo.callByRef2;

public class Operation2 {
	
	 int data=50;  
	 int yy;
	  
	 void change(Operation2 op){  
	 op.data=op.data+100;//changes will be in the instance variable  = 
	 op.yy = 1000;
	 }  

}
