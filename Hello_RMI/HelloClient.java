package first_prac;

import java.rmi.Naming;

public class HelloClient 
	{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Hello_interface k=(Hello_interface) Naming.lookup("SayHello");
		System.out.println("From Server -"+k.say());
	}

}
