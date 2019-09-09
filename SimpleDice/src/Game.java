import java.util.*;


public class Game {
  
   @SuppressWarnings("resource")
public void play() {
   
      // get input from user
      Scanner scnr = new Scanner(System.in);
      System.out.print("How much do you want to bet? ");                                                 
      int enteredBet = scnr.nextInt(); 
      System.out.print("What number do you choose ? ");
      int enteredNum = scnr.nextInt(); 
   
      // generate the die roll (Part 2)
      Random randGen1 = new Random();
      int dieNum1  =  randGen1.nextInt(6) + 1;
      int dieNum2  =  randGen1.nextInt(6) + 1;
      System.out.println("The first die is a " + dieNum1);
      System.out.println("The second die is a " + dieNum2);
      
      // write the rest of your code below
      if (dieNum1 == dieNum2) {
    	  if (enteredNum == dieNum1) {
    		  int luckyYou = enteredBet * 5;
          	  System.out.println("You Win " + luckyYou + " dollars!");
          	  }
    	  else System.out.println("Sorry, you lose!");
      }
      else  if (enteredNum == dieNum1 || enteredNum == dieNum2) {
        	System.out.println("You Win " + enteredBet + " dollars!");
        	}
        	else System.out.println("Sorry, you lose!");
      
   }
}