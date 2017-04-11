import java.rmi.*;
import java.rmi.registry.*;
public class RMIClient
{
	public static void main(String s[])
	{
		try
		{
			MethodImpl ob=(MethodImpl)Naming.lookup("rmi://192.168.137.133/sum");
			int i=ob.sum(10,20);
			System.out.println("SUM="+i);
		}
		catch(Exception e)
		{
			
		}
	}
}