import java.net.*;  // for InetAddress

public class InetAddress_getAllByName_Test {

  public static void main(String[] args) {
	  for (int i = 0; i < args.length; i++) {
		  // Get name(s)/address(es) of hosts given on command-line
		  try {
			  InetAddress[] addressList = InetAddress.getAllByName(args[i]);
			  System.out.println(args[i] + ":");
			  // Print the first name.
			  // Assume array contains at least one entry.
			  System.out.println("\t" + addressList[0].getHostName());
			  
			  for (int j = 0; j < addressList.length; j++)
				  System.out.println("\t" + addressList[j].getHostAddress());
		  } catch (UnknownHostException e) {
			  System.out.println("Unable to find address for " + args[i]);
		  }
	  }
  }
} 