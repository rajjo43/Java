package firstPackage;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,9,45,63,10};
		int b=7;
		
		try {
			for(int i=0;i<7;i++) {
				int x=a[i]/(b-7);
				System.out.print(x);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Division by Zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Error");
		}
		
	}

}
