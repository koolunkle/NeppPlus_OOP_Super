package Codes;

public class Child extends Parent {

	public Child(String str) {
		super(str);
	}

	@Override
	void testMethod() {
		System.out.println("자녀의 테스트 메소드");
	}

	void superTestMethod() {

		super.testMethod();

	}

//	public Child() {
//		super("임시문구");
//
//		System.out.println("자녀의 생성자 -> 부모의 기본() 생성자 이용");
//
//	}

}
