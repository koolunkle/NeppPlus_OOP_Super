package Codes;

public class Child extends Parent {

	@Override
	void testMethod() {
		System.out.println("자녀의 테스트 메소드");
	}

	void superTestMethod() {

		super.testMethod();

	}

	public Child() {
		super();

		System.out.println("자녀의 생성자 -> 부모의 기본() 생성자 이용");

	}

}
