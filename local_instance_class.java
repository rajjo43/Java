package firstPackage;

	//local variables
class local{
	double methodL(double a) {
		a=15.0;
		return a;
	}
	
	static double b=3.0;//class
	double c=5.0;//Instance variables

public class local_instance_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b=local.b;
		local obj =new local();
		double a = obj.methodL(15);
		double c=obj.c;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c
				);
	}

}
