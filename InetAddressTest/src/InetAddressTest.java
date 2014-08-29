import java.net.*;  // for InetAddress

public class InetAddressTest {

  public static void main(String[] args) {
	  for (int i=0;i<args.length; i++) {
		  try {
			  InetAddress address = InetAddress.getByName(args[i]);
	    	  System.out.println(args[i] + ":");
	    	  System.out.println("\t" + address.getHostName());
	    	  System.out.println("\t" + address.getHostAddress());
		  } catch (UnknownHostException e) {
			  System.out.println("Unable to find address for " + args[i]);
		  }    	  
      }
  }
} 