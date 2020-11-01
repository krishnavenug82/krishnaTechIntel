package java8.lamdaExpression.optionalExam.exampleTwo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class MainPersonalDtl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> detailedAddress = null;

		PersonalDetails personaldtl = new PersonalDetails();
		List<String> address = personaldtl.address();
		// address.forEach((itr)-> System.out.println(itr));

		address.forEach(detailedAddress);

		detailedAddress = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				Optional<String> a = Optional.ofNullable(t);
				
				

			}

		};

	}
}
