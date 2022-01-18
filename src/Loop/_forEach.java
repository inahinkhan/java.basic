//for each Loop in java

package Loop;

public class _forEach
{


	public static void main(String[] args)
          {
		        String[] names= {"Nahin Khan","CSE","Daffodill International University"};   //create string name array
		        int[] id= {3095,3096,3097,3098,3099};
		        for(String x : names)  //for each loop
		        {
		             System.out.println(x);
		        }
		        System.out.println("\tID NUMBER");
		        for(int ID:id)
		        {
		        	System.out.println(ID);
		        }
	      }
}
