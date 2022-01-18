package NumberSystem;
import java.util.Scanner;
public class DECIMAL
 {
             public static void main(String[] args)
               {
            	           Scanner input=new Scanner(System.in);
            	             System.out.print("Enter Decimal Number [ Integer ]: ");
			                 int decimal= input.nextInt();
			                 String bin=Integer.toBinaryString(decimal);
			                 System.out.println("Binary: "+bin);
			                 String oct=Integer.toOctalString(decimal);
			                 System.out.println("Octal: "+oct);
			                 String hexa=Integer.toHexString(decimal);
			                 System.out.println("Hexa Decimal: "+hexa);
               }
 }
