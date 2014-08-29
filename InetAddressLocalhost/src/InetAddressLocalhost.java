import java.net.*;  // for InetAddress

public class InetAddressLocalhost {

  public static void main(String[] args) {

    // Get name and IP address of the local host
    try {
      InetAddress address = InetAddress.getLocalHost();
      System.out.println("Local Host:");
      System.out.println("\t" + address.getHostName());
      System.out.println("\t" + address.getHostAddress());
    } catch (UnknownHostException e) {
      System.out.println("Unable to determine this host's address");
    }
  }
} 