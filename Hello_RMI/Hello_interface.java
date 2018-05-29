package first_prac;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello_interface extends Remote{
public String say() throws RemoteException;

}
