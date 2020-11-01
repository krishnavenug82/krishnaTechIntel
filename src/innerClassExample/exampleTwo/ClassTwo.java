package innerClassExample.exampleTwo;

public class ClassTwo {
	
	void addConsumer() {
		System.out.println(" From Class Two");
	}

	class ClassTwoSub {
		void addConsumerSub() {
			System.out.println(" From Class Two Sub");
		}

		class ClassTwoSubSub {
			void addConsumerSubSub() {
				System.out.println(" From Class Two Sub Sub");
			}

		}

	}

}
