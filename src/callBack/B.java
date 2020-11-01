package callBack;

public class B implements Calc {
	
	private E ee ;

	
	@Override
	public int addTwoNumber(E e) {
		System.out.println("Call back methods " + e.aa);
		return e.aa;
	}

	
	}


