package second_prac;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CaculatorServer {

	public static void main(String[] args) throws Exception {
		Registry r=LocateRegistry.createRegistry(1095);
		Calculator_implementaion a=new Calculator_implementaion();
		r.rebind("Calculator_implementation",a);
	}

}
