//get input by the user
package firstPackage;

import java.util.Scanner; //for importing Scanner class

public class InputDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		double num2;
	    String name;
		String name2;
		System.out.print("Enter Number: ");
		number=input.nextInt(); //scanf number
		
		System.out.print("Enter double Number: ");
		num2=input.nextDouble(); //scanf double number
		
		System.out.print("Enter Your Name: ");
		name=input.next(); //next only print string before space occurs;if i write rajjo chakma,it will only print rajjo
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		name2=input2.nextLine(); //nextline print full string including space;if i write rajjo chakma,it will print rajjo chakma
		
		System.out.println("Integer Number = "+number);
		System.out.println("Double Number = "+num2);
		System.out.println("Name = "+name);
		System.out.println("Name = "+name2);
	}

}
