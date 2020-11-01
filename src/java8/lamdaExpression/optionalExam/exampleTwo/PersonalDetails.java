package java8.lamdaExpression.optionalExam.exampleTwo;

import java.util.ArrayList;
import java.util.List;

public class PersonalDetails {
	
	public List<String> address(){
		
		List<String> mailingAddress = new ArrayList<String>();
		
		
		mailingAddress.add("Plot # 121");
		mailingAddress.add("MahaLakshmi Nagar");
		mailingAddress.add("Krishna nagar extn");
		mailingAddress.add("Varadharaja Puram");
		mailingAddress.add("Chennai");
		mailingAddress.add("Kanchi Puram");	
		mailingAddress.add(null);
		return mailingAddress;
	}

}
