import java.net.*;  // for InetAddress
//import java.net.UnknownHostException;

public class InetAddressTestSimple {
	public static void main(String[] args) {
	  String strHost = new String ("mail.google.com");
	  try {
		  InetAddress address = InetAddress.getByName(strHost );
		//InetAddress address = InetAddress.getByName(args[0]);
    	  System.out.println(strHost + " :");
    	  System.out.println("\t" + address.getHostName());
    	  System.out.println("\t" + address.getHostAddress());
	  } catch (UnknownHostException e) {
		  System.out.println("Unable to find address for " + strHost);
		//System.out.println("Unable to find address for " + args[0]);
	  }
	}
} 