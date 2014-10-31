import java.io.*;   // for Input/OutputStream
import java.net.*;  // for Socket and ServerSocket

public class RecvTCP {

  public static void main(String args[]) throws Exception {

    if (args.length != 1)  // Test for correct # of args
      throw new IllegalArgumentException("Parameter(s): <Port>");

    int port = Integer.parseInt(args[0]);   // Receiving Port
	
    ServerSocket servSock = new ServerSocket(port);
    Socket clntSock = servSock.accept();

    // Receive text-encoded quote
    ItemQuoteDecoder decoder = new ItemQuoteDecoderText();
    ItemQuote quote = decoder.decode(clntSock.getInputStream());
    System.out.println("Received Text-Encoded Quote:");
    System.out.println(quote);

    // Repeat quote with binary-encoding, adding 10 cents to the price
    ItemQuoteEncoder encoder = new ItemQuoteEncoderBin();
    quote.unitPrice += 10;  // Add 10 cents to unit price
    System.out.println("Sending (binary)...");
    clntSock.getOutputStream().write(encoder.encode(quote));

    clntSock.close();
    servSock.close();
  }
}
