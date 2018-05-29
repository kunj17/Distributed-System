package first_prac;

import java.rmi.registry.*;

public class HelloServer {
	public static void main(String a[]) throws Exception
	{	Registry r=LocateRegistry.createRegistry(5697);
		r.rebind("SayHello", new Hello_Implementation("Hello Client"));
		
	}

}
