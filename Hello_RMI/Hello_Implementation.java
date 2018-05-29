package first_prac;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Hello_Implementation extends UnicastRemoteObject implements Hello_interface {
	private String message;
	
	public Hello_Implementation(String msg) throws RemoteException
	{
		message=msg;  
	}
	public String say() throws RemoteException
 {
	 return message;
 }
}
