
package javatute1i;

public class JavaTute1i {
    
    public static void main(String[] args) {
      //question 1
      System.out.println("Hello World\n");
     
      //question 2
      System.out.println("Nithma Fernando");
      System.out.println("Bsc Hons in Computer Science\n");
      
      //question 3
      for(int a=1;a<=5;a++)
      {
          System.out.println("Executing loop " +a);
      }
      
      //question 3 while loop
      int b=1;
      while(b<=5)
      {
        System.out.println("Executing loop " +b);
        b++;
      }
      
      //question 4
          
         int [] numbers = {10, 20, 30, 40, 50};
         for(int x : numbers ){
         if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
         }
          System.out.println("I’m  out of the Loop now");

      //question 5
        char grade ='A';
        switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);
        
     //question 5 using if else
     char grades='A';
     if(grades=='A')
     {
       System.out.println("Excellent!");   
     }
     else if (grades=='D')
     {
         System.out.println("You passed");
     }
     else if (grades=='F')
     {
         System.out.println("Better try again");
     }
     else 
     {
         System.out.println("Invalid grade");
     }
     System.out.println("Your grade is " + grades);
     
     
     //question 6
     	 int [] number = {10, 20, 30, 40, 50};
      		for(int x : number )
                {
                System.out.print( x );
                System.out.print(",");
      		}
	        System.out.print("\n");
                
        String[] names ={"James", "Larry", "Tom", "Lacy"};
      		for( String name : names ) 
                {
        	System.out.print( name );
         	System.out.print(",");
                }
        }
     }
