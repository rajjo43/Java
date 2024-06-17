package firstPackage;

class sample1{
	void methodA() {
		System.out.println("MethodA-s1");
	}
}

class sample2 extends sample1{
       void method() {
		System.out.println("Method-s2");
	}
	void methodB() {
		System.out.println("MethodB");
	}
}

public class Miscelleneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample1 objS=new sample2();
		objS.methodA();
		
		sample1 obj = new sample1();
		obj.methodA();
	}

}
