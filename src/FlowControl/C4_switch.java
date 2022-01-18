//switch case in java

package FlowControl;

import java.util.Scanner;

public class C4_switch
{
        public static void main(String[] args)
        {
        	 
			  System.out.println("\t|  CAKE  |   |  CHOCOLATE  |   |  ICECREAM  |");
			  System.out.print("Enter anyone  : ");
			  Scanner input=new Scanner(System.in);
			  String item=input.nextLine();
			  
			  switch(item)
			  {
			     case "CAKE":
			    	 System.out.println("Menu: Cake\nPrice: 250tk");
			    	 break;
			         case "CHOCOLATE":
			    	 System.out.println("Menu: Chocolate\nPrice: 150tk");
			    	 break;
			         case "ICECREAM":
			    	 System.out.println("Menu: Ice-Cream\nPrice: 50tk");
			    	 break;
			    	 default:
			    	 System.out.println("NOT CORRECT INPUT");
			   
			  }
		}
}
