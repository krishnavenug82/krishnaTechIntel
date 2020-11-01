package java8.biConsumer.exampleTwo;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MainExamInterFaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<String> conmm = InterFaceExam::addAcc;
		conmm.accept("Srikrishna");
		
		
	}

}
