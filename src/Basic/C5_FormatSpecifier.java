//printf using in java prograam

package Basic;

public class C5_FormatSpecifier
{
       public static void main(String[] args)
            {
    	   System.out.printf("\t\t\"Format Specifier Java using printf  \"\n");
    	   
    	   //Declare and assign Data type and Variable
    	   int i=3;
           char c='N';
           double d=34.5678;
           float f=34.5f;
           String st="Nahin Khan";
           boolean b= true;
           short s=767;
           long  l=1484387567;
           
          
           //printf use in java for Display 
           
           
           System.out.printf("Integer: %d\n",i);
           System.out.printf("Character: %c\n",c);
           System.out.printf("Double: %f\n",d);
           System.out.printf("Float: %.2f\n",f);
           System.out.printf("String: %s\n",st);
           System.out.printf("Boolean: %b\n",b);
           System.out.printf("Short: %d\n",s);
           System.out.printf("Long: %d\n",l);
           	
        	}
}
