package instanceExample.regularClassWithInstance;

public class ClassOnw {
	
	void consuumer(ClassParent commercialId) {		
		
			
		if(commercialId instanceof ClassParent)System.out.println("commercialId instanceof ClassParent - " + (commercialId instanceof ClassParent));
			
		if(commercialId instanceof ClassGrantParent) System.out.println("commercialId instanceof ClassGrantParent - "+ (commercialId instanceof ClassGrantParent));	 
		
		if(commercialId instanceof ClassSuperGrantPar) System.out.println("commercialId instanceof ClassSuperGrantPar - "+ (commercialId instanceof ClassSuperGrantPar));	
		
		if(commercialId instanceof ClassSSGrantParent)System.out.println("commercialId instanceof ClassSSGrantPar - "+ (commercialId instanceof ClassSSGrantParent)); 
		
		
	} 

}
