package Codes;

public class MainDrive {

	public static void main(String[] args) {

		Parent p = new Parent("임시문구");
		Child c = new Child("임시문구");

		p.testMethod();
		c.testMethod();

		c.superTestMethod();

	}

}
