import java.util.Date;

public class dateTest {
	public static void main(String[] args) {
		String dateStr1 =  new Date().toString() ;
		byte[] dateByteStr =dateStr1.getBytes();
		System.out.println("Date : " + dateStr1) ;
		System.out.println("String to Byte :\n"+ new String(dateByteStr));
		
		System.out.println("\n------");
		String dateStr2 = new Date().toString() ;
		byte[] dateByteStr2 =  (dateStr1 + "**\n" + dateStr2+"**").getBytes() ;
		System.out.println("Date : " + dateStr2) ;
		System.out.println("String to Byte :\n"+ new String(dateByteStr2));		

	}
}
