import java.io.*;

public class package_set_bit implements package_flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte flag = 0;
		int tmp_flag =0;
		System.out.println("Enter something here :  (1,2,3,4,5)");
		 
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String s = bufferRead.readLine();
		    tmp_flag = Integer.parseInt(s);
		    System.out.println("input :" + tmp_flag);
		} catch(IOException e) {
			e.printStackTrace();
		}
		switch (tmp_flag) {
		case 1:
			flag |= package_flag01 ;
			break ;
		case 2:
			flag |= package_flag02 ;
			break ;
		case 3:
			flag |= package_flag03 ;
			break ;
		case 4:
			flag |= package_flag04 ;
			break ;
		case 5:
			flag |= package_flag05 ;
			break ;
		default:
			System.out.println("Input error");
		} // end of switch
		System.out.println("Package status : " + flag) ;
		// out.writeByte (flag) ;
	} // end of main
} // end of class
