import java.util.*; 
import java.lang.*;

class Elevator
{
	public static void main (String[] args) throws java.lang.Exception
	{
      //declare the variables here
     int pE = 0; //Postion of elevator
     int pU;	//Position of user	 
     int destination;
     
      Scanner input = new Scanner(System.in);
      System.out.println("Enter 0 for basement, 1 for first floor and 2 for second floor: ");
      System.out.println("What floor are you on?");    
      pU = input.nextInt();
      
      if (pU == 0)//Put the new code here  board 1, 2 goes here
      {
        System.out.println("Enter 1  to go to floor U or enter 2 to go to floor 2U:");
        destination = input.nextInt();
      }
      else if ( pU == 1)
      {
      	System.out.println("Enter 2 to go to floor  U or enter 0 to go to floor D.");
      	destination = input.nextInt();
      }
      else //pU == 2
      {
      	System.out.println("Enter 1 to go to floor D or enter 0 to go to floor 2D.");
      	destination = input.nextInt();
      }
      
      
      //Two scenarios of pE and pU 
      if ( pE == pU ) //Case I
      {
        //Open the door to let the customer in 
        System.out.println("The door is open, please get in!");
      
         //close the door so we can go up or down
        System.out.println("The door is closing, please stand clear!"); 
       
       	 if (pE > destination)	
       	 { //going down
        	while(pE != destination)
            {
             pE--;
             System.out.println("We are going down to " + pE);
             		 
            }
           System.out.println("The door is opening... please exit!");
           System.out.println("The door is closing");
        }
        else 
       	 {//going up
         	 while(pE != destination)
            	{
            	 pE++;
                 System.out.println("We are going up to " + pE);  
          	  	} 
           System.out.println("The door is opening... please exit!");
           System.out.println("The door is closing");
         }
      }
      else      //Case II
      { // pE != pU
      //Board 5 and 6
       
        	if(pE > pU) // elevator needs to go down
       	 	{
        		while(pE != pU)
                { 
                  pE--; 
                  System.out.println("Going Down to " + pE);      
                }      
            }
       	   else //pE < pU , pE = 0, pU = 2
        	{
          		while(pE != pU)
                { 
                  pE++; 
                  System.out.println("Going Up to " + pE);  
                }
        	}
        
         //at this point pE == pU
         //copy code from case I 
         System.out.println("The door is open, please get in!");
      
         //close the door so we can go up or down
         System.out.println("The door is closing, please stand clear!"); 
       
       	 if (pE > destination)	
       	 { //going down
        	while(pE != destination)
            {
             pE--;
             System.out.println("We are going down to " + pE);
             		 
            }
           System.out.println("The door is opening... please exit!");
           System.out.println("The door is closing");
        }
        else 
       	 {//going up
         	 while(pE != destination)
            	{
            	 pE++;
                 System.out.println("We are going up to " + pE);  
          	  	} 
           System.out.println("The door is opening... please exit!");
           System.out.println("The door is closing");
         }
      }
   
	}//closing main
} //closing class

	




