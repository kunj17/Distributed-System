package second_prac;
import java.rmi.Remote;
public interface Calculator_interface extends Remote {

	public int add(int a,int b);
	public int sub(int a,int b);
	public int mul(int a,int b);
	public int div(int a,int b);
	
}
