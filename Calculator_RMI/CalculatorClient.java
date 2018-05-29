package second_prac;
import java.rmi.Naming;
import java.util.Scanner;
public class CalculatorClient {

	public static void main(String[] args) throws Exception {
		
		Calculator_interface k=(Calculator_interface) Naming.lookup("Calculator");
		System.out.println("Enter 1 to Add \n Enter 2 to Sub \n Enter 3 to Multiply \n Enter 4 to divide");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
	
		System.out.print("Enter 1st Number: ");
		int a=s.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b=s.nextInt();
		s.close();
		switch(choice)
		{
		case 1:
			System.out.println("Result -"+k.add(a, b));
			
			break;

		case 2:
			System.out.println("Result -"+k.sub(a, b));
			
			break;

		case 3:
			System.out.println("Result -"+k.mul(a, b));
			
			break;
		case 4:
			System.out.println("Result -"+k.div(a, b));
			
			break;
			
		}

	}

}
