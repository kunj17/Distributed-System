package second_prac;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class Calculator_implementaion extends UnicastRemoteObject implements Calculator_interface{
	
	public Calculator_implementaion() throws RemoteException {
		super();
	}
	
	public int add(int a,int b){ return a+b;}

	public int sub(int a,int b){ return a-b;}
	public int mul(int a,int b){ return a*b;}
	public int div(int a,int b){ return a/b;}
	
	

}
