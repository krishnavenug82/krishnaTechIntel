package casting.abstractCasting;

public class AbsCastingMainAB {
	
	public static void main(String args[]) {
		
		AbsCastingA bsCastingA = new AbsCastingB();
		bsCastingA.add();
		
		
		AbsCastingB bsCastingB = (AbsCastingB) bsCastingA;
		bsCastingB.add();
		
	}

}
